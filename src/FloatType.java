/*  Pennywise: A tool for fuzzing SMT solvers in the theory of FP.
 *  Written by Sam Olds and Matthew Turner. 
 * 
 *  Pennywise is based on FuzzSMT:
 *	FuzzSMT: Fuzzing tool for Satisfiablity Modulo Theories (SMT) benchmarks.
 *  Copyright (C) 2009  Robert Daniel Brummayer
 */
public class FloatType extends SMTType {

	protected String name;

	protected int bits;  

	public FloatType(int b) {	  
		assert(b > 0);
		this.bits = b;
		this.name = "Float" + b;
	}

	public String toString() {
		return this.name;
	}

	public int getWidth(){
		return this.bits;
	}

	public boolean equals (Object o){
		assert (o != null);

		if (! (o instanceof FloatType))
			return false;

		return this.bits == ((FloatType) o).bits;
	}

}