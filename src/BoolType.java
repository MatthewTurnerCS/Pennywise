/*  Pennywise: A tool for fuzzing SMT solvers in the theory of FP.
 *  Written by Sam Olds and Matthew Turner. 
 * 
 *  Pennywise is based on FuzzSMT:
 *	FuzzSMT: Fuzzing tool for Satisfiablity Modulo Theories (SMT) benchmarks.
 *  Copyright (C) 2009  Robert Daniel Brummayer
 */
public class BoolType extends SMTType {

	public final static BoolType boolType = new BoolType();

	private BoolType() {}

	public String toString() {
		return "bool";
	}

}