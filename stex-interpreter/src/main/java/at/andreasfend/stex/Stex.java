package at.andreasfend.stex;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;

import at.andreasfend.stex.core.Instruction;
import at.andreasfend.stex.parser.Compiler;
import at.andreasfend.stex.parser.StexProgram;
import at.andreasfend.stex.runtime.DataType;
import at.andreasfend.stex.runtime.DataUnit;
import at.andreasfend.stex.runtime.Machine;

public class Stex {
	
	public static void main(String[] args) {
		new Stex(args).parse();
	}
	
	private String[] args;
	private Options options = new Options();
	private String outputFile = null;
	
	public Stex(String[] args) {
		this.args = args;
		
		options.addOption("h", "help", false, "show help");
		
		Option cOpt = new Option("c", "compile", true, "compiles into outputfile");
		cOpt.setArgs(1);
		cOpt.setArgName("outputfile");
		options.addOption(cOpt);
		
		Option rOpt = new Option("r", "run", false, "Executes the given stex-executable or stex-source in a new Runtime-Machine");
		options.addOption(rOpt);
	}
	
	public void parse() {
		CommandLineParser parser = new BasicParser();
		CommandLine cmd;
		
		try {
			cmd = parser.parse(options, args);
			
			if(cmd.hasOption("h")) {
				help();
			}
			
			if(cmd.hasOption("c")) {
				String outputfile = cmd.getOptionValue("c");
				if(outputfile == null)
					outputfile = "app.sexc";
				this.outputFile = outputfile;
				compile(cmd.getArgList());
			}
			
			if(cmd.hasOption("r")) {
				if(cmd.getArgList().size() == 0) {
					
				}
				else {
					String executable = cmd.getArgList().get(0);
					String[] args = new String[cmd.getArgList().size()-1];
					for (int i = 0; i < args.length; i++) {
						args[i] = cmd.getArgList().get(i+1);
					}
					run(executable, args);
				}
			}
			
			help();
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	private void help() {
		HelpFormatter formater = new HelpFormatter();
		formater.printHelp("Stex", options);
		System.exit(0);
	}
	
	private void compile(List<String> inputfiles) {
		Compiler compiler = new Compiler();
		File[] files = new File[inputfiles.size()];
		for (int i = 0; i < files.length; i++) {
			files[i] = new File(inputfiles.get(i));
		}
		
		StexProgram program = compiler.compile(files);
		Gson gson = new Gson();
		String serialize = gson.toJson(program);
		
		try {
			FileUtils.writeStringToFile(new File(outputFile), serialize, "UTF-8");
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	private void run(String executable, String args[]) {
		File file = new File(executable);
		String json = "";
		StexProgram program = null;
		
		if (executable.endsWith(".stexc")) {
			try {
				json = FileUtils.readFileToString(file, "UTF-8");
				
				Gson gson = new Gson();
				program = gson.fromJson(json, StexProgram.class);
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(1);
			}
		} else if (executable.endsWith(".stex")) {
			Compiler compiler = new Compiler();
			File[] srcFiles = new File[] { 
					new File(executable)
				};
			program = compiler.compile(srcFiles);
		} else {
			System.err.println("Wrong file suffix");
			System.exit(1);
		}
		
		
		
		if(program.getStartingPoint() == null) {
			System.err.println("No main function defined in this stex-executable");
			System.exit(1);
		}
		
		Machine machine = new Machine(program.getInstructions(), program.getStartingPoint());
		machine.setArgs(args);
		
		try {
			DataUnit result = machine.execute();
			if(result == null)
				System.exit(0);
			if(result.getType() == DataType.INTEGER)
				System.exit(result.getInteger());
			System.exit(0);
		}
		catch(RuntimeException e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
		
	}

}
