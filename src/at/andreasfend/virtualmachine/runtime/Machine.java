package at.andreasfend.virtualmachine.runtime;

import java.io.IOException;
import java.util.List;

import at.andreasfend.virtualmachine.runtime.Operand.Type;

public class Machine implements Runnable {

	private SubroutineStack stack;
	private SubroutineStack sub = null;
	private int mip;
	private boolean debug;
	private List<Instruction> instructions;

	public Machine(List<Instruction> instructions, boolean debug) {
		this.mip = 0;
		this.debug = debug;
		this.instructions = instructions;
		stack = new SubroutineStack();
	}

	@Override
	public void run() {

		while (mip < instructions.size()) {
			Instruction instruction = instructions.get(mip);

			switch (instruction.getOp()) {
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

			case READ:
				read(instruction);
				break;
			case PRINT:
				print(instruction);
				break;
			case ERR:
				err(instruction);
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

			default:
				break;
			}

			mip++;
		}

	}

	private void add(Instruction instruction) {
		DataUnit op1 = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
		DataUnit op2 = instruction.getOp2().getType() == Type.VAL ? DataUnit.parse(instruction.getOp2().getValue())
				: stack.get(instruction.getOp2().getIdentifier());
		DataUnit target = Arithetik.add(op1, op2);
		stack.assign(instruction.getTarget(), target);

	}

	private void sub(Instruction instruction) {
		DataUnit op1 = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
		DataUnit op2 = instruction.getOp2().getType() == Type.VAL ? DataUnit.parse(instruction.getOp2().getValue())
				: stack.get(instruction.getOp2().getIdentifier());
		DataUnit target = Arithetik.sub(op1, op2);
		stack.assign(instruction.getTarget(), target);
	}

	private void mul(Instruction instruction) {
		DataUnit op1 = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
		DataUnit op2 = instruction.getOp2().getType() == Type.VAL ? DataUnit.parse(instruction.getOp2().getValue())
				: stack.get(instruction.getOp2().getIdentifier());
		DataUnit target = Arithetik.mul(op1, op2);
		stack.assign(instruction.getTarget(), target);
	}

	private void div(Instruction instruction) {
		DataUnit op1 = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
		DataUnit op2 = instruction.getOp2().getType() == Type.VAL ? DataUnit.parse(instruction.getOp2().getValue())
				: stack.get(instruction.getOp2().getIdentifier());
		DataUnit target = Arithetik.div(op1, op2);
		stack.assign(instruction.getTarget(), target);
	}

	private void mod(Instruction instruction) {
		DataUnit op1 = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
		DataUnit op2 = instruction.getOp2().getType() == Type.VAL ? DataUnit.parse(instruction.getOp2().getValue())
				: stack.get(instruction.getOp2().getIdentifier());
		DataUnit target = Arithetik.mod(op1, op2);
		stack.assign(instruction.getTarget(), target);
	}

	private void substack(Instruction instruction) {
		sub = new SubroutineStack();
		sub.setParent(stack);
	}

	private void parameter(Instruction instruction) {
		DataUnit data = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());

		sub.makeVar(instruction.getTarget());
		sub.assign(instruction.getTarget(), data);
	}

	private void call(Instruction instruction) {
		stack = sub;
		sub = null;
		stack.setRetPointer(mip);
		stack.setTarget(instruction.getTarget());
		mip = (Integer) instruction.getOp1().getValue();
	}

	private void ret(Instruction instruction) {
		String target = stack.getTarget();
		DataUnit data = null;
		if (instruction.getOp1() != null)
			data = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
					: stack.get(instruction.getOp1().getIdentifier());
		mip = stack.getRetPointer();
		stack = stack.getParent();

		if (stack == null) {
			if (data != null)
				System.out.println(data.print());
			mip = instructions.size();
		} else if (target != null)
			stack.assign(target, data);
	}

	private void cmp(Instruction instruction) {
		DataUnit op1 = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
		DataUnit op2 = instruction.getOp2().getType() == Type.VAL ? DataUnit.parse(instruction.getOp2().getValue())
				: stack.get(instruction.getOp2().getIdentifier());
		if (op1.getType() != DataType.BOOL && op2.getType() != DataType.INTEGER)
			throw new RuntimeException("Expected Bool and Integer, got datatypes: " + op1.getType().name() + " and "
					+ op2.getType().name());
		Boolean val = op1.getBool();
		if (val)
			mip = op2.getInteger();
	}

	private void jmp(Instruction instruction) {
		DataUnit data = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
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

	private void var(Instruction instruction) {
		DataUnit data = new DataUnit(null, DataType.NULL, false);
		if (instruction.getOp1() != null)
			data = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
					: stack.get(instruction.getOp1().getIdentifier());
		stack.makeVar(instruction.getTarget());
		stack.assign(instruction.getTarget(), data);
	}

	private void constante(Instruction instruction) {
		stack.makeConstante(instruction.getTarget(), DataUnit.parse(instruction.getOp1().getValue()));
	}

	private void assign(Instruction instruction) {
		DataUnit data = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
		stack.assign(instruction.getTarget(), data);
	}

	private void ref(Instruction instruction) {
		DataUnit data = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
		DataUnit pointer = new DataUnit(data, DataType.POINTER, false);
		stack.assign(instruction.getTarget(), pointer);
	}

	private void rref(Instruction instruction) {
		DataUnit pointer = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
		if (pointer.getType() != DataType.POINTER)
			throw new RuntimeException("Trying to dereference a non-pointer: " + instruction.getOp1().getIdentifier());
		DataUnit data = pointer.getPoiner();
		stack.assign(instruction.getTarget(), data);
	}

	private void wref(Instruction instruction) {
		DataUnit data = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
		DataUnit pointer = stack.get(instruction.getTarget());
		if (pointer.getType() != DataType.POINTER)
			throw new RuntimeException("Trying to dereference a non-pointer: " + instruction.getOp1().getIdentifier());
		pointer.getPoiner().set(data.getContent(), data.getType());
	}

	private void array(Instruction instruction) {
		DataUnit size = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
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
		DataUnit arr = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
		if (arr.getType() != DataType.ARRAY)
			throw new RuntimeException("Expected data type array, but got: " + arr.getType().name());
		DataUnit index = instruction.getOp2().getType() == Type.VAL ? DataUnit.parse(instruction.getOp2().getValue())
				: stack.get(instruction.getOp2().getIdentifier());
		if (index.getType() != DataType.INTEGER)
			throw new RuntimeException("Expected data type integer, but got: " + index.getType().name());
		if (index.getInteger() < 0 || index.getInteger() >= arr.getArray().length)
			throw new RuntimeException(
					"Out of index at array " + instruction.getOp1() + " with i: " + index.getInteger());
		stack.assign(instruction.getTarget(), arr.getArray()[index.getInteger()]);
	}

	private void warray(Instruction instruction) {
		DataUnit data = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
		DataUnit index = instruction.getOp2().getType() == Type.VAL ? DataUnit.parse(instruction.getOp2().getValue())
				: stack.get(instruction.getOp2().getIdentifier());
		DataUnit arr = stack.get(instruction.getTarget());
		if (arr.getType() != DataType.ARRAY)
			throw new RuntimeException("Expected data type array, but got: " + arr.getType().name());
		if (index.getType() != DataType.INTEGER)
			throw new RuntimeException("Expected data type integer, but got: " + index.getType().name());
		if (index.getInteger() < 0 || index.getInteger() >= arr.getArray().length)
			throw new RuntimeException(
					"Out of index at array " + instruction.getOp1() + " with i: " + index.getInteger());
		arr.getArray()[index.getInteger()] = data;
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
		DataUnit data = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
		System.out.print(data.print());
	}
	
	private void err(Instruction instruction) {
		DataUnit data = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
		System.err.print(data.print());
	}
	
	private void toInt(Instruction instruction) {
		DataUnit data = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
		DataUnit conv = Convert.toInt(data);
		stack.assign(instruction.getTarget(), conv);
	}
	
	private void toFloat(Instruction instruction) {
		DataUnit data = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
		DataUnit conv = Convert.toFloat(data);
		stack.assign(instruction.getTarget(), conv);
	}
	
	private void toBool(Instruction instruction) {
		DataUnit data = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
		DataUnit conv = Convert.toBool(data);
		stack.assign(instruction.getTarget(), conv);
	}
	
	private void toString(Instruction instruction) {
		DataUnit data = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
		DataUnit conv = Convert.toString(data);
		stack.assign(instruction.getTarget(), conv);
	}

	private void equals(Instruction instruction) {
		DataUnit op1 = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
		DataUnit op2 = instruction.getOp2().getType() == Type.VAL ? DataUnit.parse(instruction.getOp2().getValue())
				: stack.get(instruction.getOp2().getIdentifier());
		DataUnit target = Logical.equals(op1, op2);
		stack.assign(instruction.getTarget(), target);
	}

	private void notEquals(Instruction instruction) {
		DataUnit op1 = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
		DataUnit op2 = instruction.getOp2().getType() == Type.VAL ? DataUnit.parse(instruction.getOp2().getValue())
				: stack.get(instruction.getOp2().getIdentifier());
		DataUnit target = Logical.notEquals(op1, op2);
		stack.assign(instruction.getTarget(), target);
	}

	private void bigger(Instruction instruction) {
		DataUnit op1 = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
		DataUnit op2 = instruction.getOp2().getType() == Type.VAL ? DataUnit.parse(instruction.getOp2().getValue())
				: stack.get(instruction.getOp2().getIdentifier());
		DataUnit target = Logical.bigger(op1, op2);
		stack.assign(instruction.getTarget(), target);
	}

	private void smaller(Instruction instruction) {
		DataUnit op1 = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
		DataUnit op2 = instruction.getOp2().getType() == Type.VAL ? DataUnit.parse(instruction.getOp2().getValue())
				: stack.get(instruction.getOp2().getIdentifier());
		DataUnit target = Logical.smaller(op1, op2);
		stack.assign(instruction.getTarget(), target);
	}

	private void and(Instruction instruction) {
		DataUnit op1 = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
		DataUnit op2 = instruction.getOp2().getType() == Type.VAL ? DataUnit.parse(instruction.getOp2().getValue())
				: stack.get(instruction.getOp2().getIdentifier());
		DataUnit target = Logical.and(op1, op2);
		stack.assign(instruction.getTarget(), target);
	}

	private void or(Instruction instruction) {
		DataUnit op1 = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
		DataUnit op2 = instruction.getOp2().getType() == Type.VAL ? DataUnit.parse(instruction.getOp2().getValue())
				: stack.get(instruction.getOp2().getIdentifier());
		DataUnit target = Logical.or(op1, op2);
		stack.assign(instruction.getTarget(), target);
	}

	private void not(Instruction instruction) {
		DataUnit op1 = instruction.getOp1().getType() == Type.VAL ? DataUnit.parse(instruction.getOp1().getValue())
				: stack.get(instruction.getOp1().getIdentifier());
		DataUnit target = Logical.not(op1);
		stack.assign(instruction.getTarget(), target);
	}

}
