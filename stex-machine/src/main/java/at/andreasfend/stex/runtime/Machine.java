package at.andreasfend.stex.runtime;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import at.andreasfend.stex.core.Instruction;
import at.andreasfend.stex.core.Operand.Type;
import at.andreasfend.stex.runtime.operation.Arithetik;
import at.andreasfend.stex.runtime.operation.Convert;
import at.andreasfend.stex.runtime.operation.Logical;

public class Machine {

	private SubroutineStack stack;
	private SubroutineStack sub = null;
	private int mip;
	private DataUnit result = null;
	private boolean debug = false;
	private List<Instruction> instructions;

	public Machine(List<Instruction> instructions, boolean debug) {
		this.mip = 0;
		this.debug = debug;
		this.instructions = instructions;
		stack = new SubroutineStack();
	}
	
	public void setArgs(String[] args) {
		stack.makeVar("args");
		stack.assign("args", new DataUnit(args, DataType.ARRAY));
	}
	
	public Machine(List<Instruction> instructions, int startingPoint) {
		this(instructions, false);
		mip = startingPoint;
	}

	public DataUnit execute() {

		while (mip < instructions.size()) {
			Instruction instruction = instructions.get(mip);

			switch (instruction.getOp()) {
			case NOP:
				break;
			case DEBUG:
				debug();
				break;
			
			case ADD:
				add(instruction);
				break;
			case SUB:
				sub(instruction);
				break;
			case MUL:
				mul(instruction);
				break;
			case DIV:
				div(instruction);
				break;
			case MOD:
				mod(instruction);
				break;
			case SIZE:
				size(instruction);
				break;

			case SUBSTACK:
				substack(instruction);
				break;
			case PARAMETER:
				parameter(instruction);
				break;
			case CALL:
				call(instruction);
				break;
			case RET:
				ret(instruction);
				break;
			case CMP:
				cmp(instruction);
				break;
			case JMP:
				jmp(instruction);
				break;
			case BLOCK:
				block(instruction);
				break;
			case LEAVE:
				leave(instruction);
				break;
			case TRYCATCH:
				trycatch(instruction);
				break;
			case THROW:
				throwExp(instruction);
				break;

			case VAR:
				var(instruction);
				break;
			case CONST:
				constante(instruction);
				break;
			case ASSIGN:
				assign(instruction);
				break;
			case REF:
				ref(instruction);
				break;
			case RREF:
				rref(instruction);
				break;
			case WREF:
				wref(instruction);
				break;
			case ARRAY:
				array(instruction);
				break;
			case RARRAY:
				rarray(instruction);
				break;
			case WARRAY:
				warray(instruction);
				break;
			case OBJECT:
				object(instruction);
				break;
			case STRUCTURE:
				structure(instruction);
				break;

			case READ:
				read(instruction);
				break;
			case PRINT:
				print(instruction);
				break;
			case ERR:
				err(instruction);
				break;
				
			case TYPE:
				type(instruction);
				break;
			case INT:
				toInt(instruction);
				break;
			case FLOAT:
				toFloat(instruction);
				break;
			case BOOL:
				toBool(instruction);
				break;
			case STRING:
				toString(instruction);
				break;

			case EQUALS:
				equals(instruction);
				break;
			case NOTEQUALS:
				notEquals(instruction);
				break;
			case BIGGER:
				bigger(instruction);
				break;
			case SMALLER:
				smaller(instruction);
				break;
			case AND:
				and(instruction);
				break;
			case OR:
				or(instruction);
				break;
			case NOT:
				not(instruction);
				break;
			case IN:
				in(instruction);
				break;

			default:
				break;
			}

			mip++;
		}
		
		return result;

	}

	private DataUnit getOp1(Instruction instruction) {
		DataUnit op1 = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
		return op1;
	}
	
	private DataUnit getOp2(Instruction instruction) {
		DataUnit op2 = instruction.getOp2().getType() == Type.VAL ? DataUnit.parse(instruction.getOp2().getValue())
				: stack.get(instruction.getOp2().getIdentifier());
		return op2;
	}
	
	
	private void debug() {
		if(this.debug) {
			// TODO: Something
		}
	}
	
	private void add(Instruction instruction) {
		DataUnit op1 = getOp1(instruction);
		DataUnit op2 = getOp2(instruction);
		DataUnit target = Arithetik.add(op1, op2);
		stack.assign(instruction.getTarget(), target);

	}

	private void sub(Instruction instruction) {
		DataUnit op1 = getOp1(instruction);
		DataUnit op2 = getOp2(instruction);
		DataUnit target = Arithetik.sub(op1, op2);
		stack.assign(instruction.getTarget(), target);
	}

	private void mul(Instruction instruction) {
		DataUnit op1 = getOp1(instruction);
		DataUnit op2 = getOp2(instruction);
		DataUnit target = Arithetik.mul(op1, op2);
		stack.assign(instruction.getTarget(), target);
	}

	private void div(Instruction instruction) {
		DataUnit op1 = getOp1(instruction);
		DataUnit op2 = getOp2(instruction);
		DataUnit target = Arithetik.div(op1, op2);
		stack.assign(instruction.getTarget(), target);
	}

	private void mod(Instruction instruction) {
		DataUnit op1 = getOp1(instruction);
		DataUnit op2 = getOp2(instruction);
		DataUnit target = Arithetik.mod(op1, op2);
		stack.assign(instruction.getTarget(), target);
	}
	
	private void size(Instruction instruction) {
		DataUnit data = getOp1(instruction);
		DataUnit target = null;
		if(data.getType() == DataType.ARRAY)
			target = new DataUnit(data.getArray().length, DataType.INTEGER);
		else if(data.getType() == DataType.STRING)
			target = new DataUnit(data.getString().length(), DataType.INTEGER);
		else if(data.getType() == DataType.OBJECT)
			target = new DataUnit(data.getObject().size(), DataType.INTEGER);
		else
			throw new RuntimeException("Invalid data type: " + data.getType().name());
		stack.assign(instruction.getTarget(), target);
	}

	private void substack(Instruction instruction) {
		sub = new SubroutineStack();
		sub.setParent(stack);
	}

	private void parameter(Instruction instruction) {
		DataUnit data = getOp1(instruction);
		sub.makeVar(instruction.getTarget());
		sub.assign(instruction.getTarget(), data);
	}

	private void call(Instruction instruction) {
		stack = sub;
		sub = null;
		stack.setRetPointer(mip);
		stack.setTarget(instruction.getTarget());
		mip = new Double(Double.parseDouble(instruction.getOp1().getValue().toString())).intValue();
	}

	private void ret(Instruction instruction) {
		String target = stack.getTarget();
		DataUnit data = null;
		if (instruction.getOp1() != null)
			data = getOp1(instruction);
		mip = stack.getRetPointer();
		stack = stack.getParent();

		if (stack == null) {
			if (data != null)
				result = data;
			mip = instructions.size();
		} else if (target != null)
			stack.assign(target, data);
	}

	private void cmp(Instruction instruction) {
		DataUnit op1 = getOp1(instruction);
		DataUnit op2 = getOp2(instruction);
		if (op1.getType() != DataType.BOOL && op2.getType() != DataType.INTEGER)
			throw new RuntimeException("Expected Bool and Integer, got datatypes: " + op1.getType().name() + " and "
					+ op2.getType().name());
		Boolean val = op1.getBool();
		if (val)
			mip = op2.getInteger();
	}

	private void jmp(Instruction instruction) {
		DataUnit data = getOp1(instruction);
		if (data.getType() != DataType.INTEGER)
			throw new RuntimeException("Expected Integer, got datatype: " + data.getType().name());
		mip = data.getInteger();
	}

	private void block(Instruction instruction) {
		stack.enterBlock();
	}

	private void leave(Instruction instruction) {
		stack.leaveBlock();
	}
	
	private void trycatch(Instruction instruction) {
		DataUnit catchJmp = getOp1(instruction);
		stack.enterTry(catchJmp.getInteger(), instruction.getTarget());
	}
	
	private void throwExp(Instruction instruction) {
		DataUnit exp = getOp1(instruction);
		SubroutineStack catchStack = stack.throwException();
		if(catchStack == null)
			throw new RuntimeException("Uncaught exception: " + exp);
		this.stack = catchStack;
		String target = stack.getExceptionIdentifier();
		Integer catchPointer = stack.getCatchPointer();
		stack.leaveBlock();
		stack.enterBlock();
		stack.makeVar(target);
		stack.assign(target, exp);
		mip = catchPointer;
	}

	private void var(Instruction instruction) {
		DataUnit data = new DataUnit(null, DataType.NULL, false);
		if (instruction.getOp1() != null)
			data = getOp1(instruction);
		stack.makeVar(instruction.getTarget());
		stack.assign(instruction.getTarget(), data);
	}

	@Deprecated
	private void constante(Instruction instruction) {
		stack.makeConstante(instruction.getTarget(), DataUnit.parse(instruction.getOp1().getValue()));
	}

	private void assign(Instruction instruction) {
		DataUnit data = getOp1(instruction);		
		stack.assign(instruction.getTarget(), data);
	}

	private void ref(Instruction instruction) {
		DataUnit data = getOp1(instruction);
		DataUnit pointer = new DataUnit(data, DataType.POINTER, false);
		stack.assign(instruction.getTarget(), pointer);
	}

	private void rref(Instruction instruction) {
		DataUnit pointer = getOp1(instruction);
		if (pointer.getType() != DataType.POINTER)
			throw new RuntimeException("Trying to dereference a non-pointer: " + instruction.getOp1().getIdentifier());
		DataUnit data = pointer.getPoiner();
		stack.assign(instruction.getTarget(), data);
	}

	private void wref(Instruction instruction) {
		DataUnit data = getOp1(instruction);
		DataUnit pointer = stack.get(instruction.getTarget());
		if (pointer.getType() != DataType.POINTER)
			throw new RuntimeException("Trying to dereference a non-pointer: " + instruction.getOp1().getIdentifier());
		pointer.getPoiner().set(data.getContent(), data.getType());
	}

	private void array(Instruction instruction) {
		DataUnit size = getOp1(instruction);
		if (size.getType() != DataType.INTEGER)
			throw new RuntimeException("Expected data type integer, but got: " + size.getType().name());
		DataUnit[] arr = new DataUnit[size.getInteger()];
		for (int i = 0; i < size.getInteger(); i++) {
			arr[i] = new DataUnit(null, DataType.NULL);
		}
		DataUnit data = new DataUnit(arr, DataType.ARRAY);
		stack.assign(instruction.getTarget(), data);
	}

	private void rarray(Instruction instruction) {
		DataUnit arr = getOp1(instruction);
		if (arr.getType() != DataType.ARRAY && arr.getType() != DataType.STRING)
			throw new RuntimeException("Invalid data type: " + arr.getType().name());
		DataUnit index = getOp2(instruction);
		if (index.getType() != DataType.INTEGER)
			throw new RuntimeException("Expected data type integer, but got: " + index.getType().name());
		
		DataUnit target = null;
		if(arr.getType() == DataType.ARRAY) {
			if (index.getInteger() < 0 || index.getInteger() >= arr.getArray().length)
				throw new RuntimeException(
						"Out of index at array " + instruction.getOp1() + " with i: " + index.getInteger());
			target = arr.getArray()[index.getInteger()];
		}
		else {
			if(index.getInteger() < 0 || index.getInteger() >= arr.getString().length())
				throw new RuntimeException(
						"Out of index at array " + instruction.getOp1() + " with i: " + index.getInteger());
			target = new DataUnit(arr.getString().substring(index.getInteger(), index.getInteger() + 1),
					DataType.STRING);
		}
		
		stack.assign(instruction.getTarget(), target);
	}

	private void warray(Instruction instruction) {
		DataUnit data = getOp1(instruction);
		DataUnit index = getOp2(instruction);
		DataUnit arr = stack.get(instruction.getTarget());
		if (arr.getType() != DataType.ARRAY && arr.getType() != DataType.STRING)
			throw new RuntimeException("Expected data type array, but got: " + arr.getType().name());
		if (index.getType() != DataType.INTEGER)
			throw new RuntimeException("Expected data type integer, but got: " + index.getType().name());
		
		if(arr.getType() == DataType.ARRAY) {
			if (index.getInteger() < 0 || index.getInteger() >= arr.getArray().length)
				throw new RuntimeException(
						"Out of index at array " + instruction.getOp1() + " with i: " + index.getInteger());
			arr.getArray()[index.getInteger()] = data;
		}
		else {
			if (index.getInteger() < 0 || index.getInteger() >= arr.getString().length())
				throw new RuntimeException(
						"Out of index at array " + instruction.getOp1() + " with i: " + index.getInteger());
			String insert = Convert.toString(data).getString();
			String result = arr.getString().substring(0, index.getInteger()) + insert +
					arr.getString().substring(index.getInteger()+1);
			arr.set(result, DataType.STRING);
		}
	}
	
	private void object(Instruction instruction) {
		DataUnit obj = new DataUnit(new HashMap<String, DataUnit>(), DataType.OBJECT);
		stack.assign(instruction.getTarget(), obj);
	}
	
	private void structure(Instruction instruction) {
		DataUnit obj = getOp1(instruction);
		if(obj.getType() != DataType.OBJECT)
			throw new RuntimeException("Expected object, but got: " + obj.getType().name());
		DataUnit[] arr = new DataUnit[obj.getObject().size()];
		int index = 0;
		for (String field: obj.getObject().keySet()) {
			arr[index] = new DataUnit(field, DataType.STRING);
		}
		DataUnit res = new DataUnit(arr, DataType.ARRAY);
		stack.assign(instruction.getTarget(), res);
	}

	private void read(Instruction instruction) {
		try {
			byte[] buffer = new byte[256];
			System.in.read(buffer);
			String content = new String(buffer);
			DataUnit data = new DataUnit(content, DataType.STRING);
			stack.assign(instruction.getTarget(), data);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private void print(Instruction instruction) {
		DataUnit data = getOp1(instruction);
		System.out.print(data.print());
	}
	
	private void err(Instruction instruction) {
		DataUnit data = getOp1(instruction);
		System.err.print(data.print());
	}
	
	private void type(Instruction instruction) {
		DataUnit data = getOp1(instruction);
		DataUnit typeCode = new DataUnit(data.getType().getCode(), DataType.INTEGER);
		stack.assign(instruction.getTarget(), typeCode);
	}
	
	private void toInt(Instruction instruction) {
		DataUnit data = getOp1(instruction);
		DataUnit conv = Convert.toInt(data);
		stack.assign(instruction.getTarget(), conv);
	}
	
	private void toFloat(Instruction instruction) {
		DataUnit data = getOp1(instruction);
		DataUnit conv = Convert.toFloat(data);
		stack.assign(instruction.getTarget(), conv);
	}
	
	private void toBool(Instruction instruction) {
		DataUnit data = getOp1(instruction);
		DataUnit conv = Convert.toBool(data);
		stack.assign(instruction.getTarget(), conv);
	}
	
	private void toString(Instruction instruction) {
		DataUnit data = getOp1(instruction);
		DataUnit conv = Convert.toString(data);
		stack.assign(instruction.getTarget(), conv);
	}

	private void equals(Instruction instruction) {
		DataUnit op1 = getOp1(instruction);
		DataUnit op2 = getOp2(instruction);
		DataUnit target = Logical.equals(op1, op2);
		stack.assign(instruction.getTarget(), target);
	}

	private void notEquals(Instruction instruction) {
		DataUnit op1 = getOp1(instruction);
		DataUnit op2 = getOp2(instruction);
		DataUnit target = Logical.notEquals(op1, op2);
		stack.assign(instruction.getTarget(), target);
	}

	private void bigger(Instruction instruction) {
		DataUnit op1 = getOp1(instruction);
		DataUnit op2 = getOp2(instruction);
		DataUnit target = Logical.bigger(op1, op2);
		stack.assign(instruction.getTarget(), target);
	}

	private void smaller(Instruction instruction) {
		DataUnit op1 = getOp1(instruction);
		DataUnit op2 = getOp2(instruction);
		DataUnit target = Logical.smaller(op1, op2);
		stack.assign(instruction.getTarget(), target);
	}

	private void and(Instruction instruction) {
		DataUnit op1 = getOp1(instruction);
		DataUnit op2 = getOp2(instruction);
		DataUnit target = Logical.and(op1, op2);
		stack.assign(instruction.getTarget(), target);
	}

	private void or(Instruction instruction) {
		DataUnit op1 = getOp1(instruction);
		DataUnit op2 = getOp2(instruction);
		DataUnit target = Logical.or(op1, op2);
		stack.assign(instruction.getTarget(), target);
	}

	private void not(Instruction instruction) {
		DataUnit op1 = getOp1(instruction);
		DataUnit target = Logical.not(op1);
		stack.assign(instruction.getTarget(), target);
	}
	
	private void in(Instruction instruction) {
		DataUnit set = getOp1(instruction);
		DataUnit elem = getOp2(instruction);
		DataUnit target = Logical.in(set, elem);
		stack.assign(instruction.getTarget(), target);
	}

}
