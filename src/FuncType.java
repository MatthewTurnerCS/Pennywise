/*  Pennywise: A tool for fuzzing SMT solvers in the theory of FP.
 *  Written by Sam Olds and Matthew Turner. 
 * 
 *  Pennywise is based on FuzzSMT:
 *	FuzzSMT: Fuzzing tool for Satisfiablity Modulo Theories (SMT) benchmarks.
 *  Copyright (C) 2009  Robert Daniel Brummayer
 */
public class FuncType extends SMTType {

	String name;
	Signature sig;
	
	public FuncType(String n, Signature s){
		name = n;
		sig = s;
	}
	
	@Override
	public String toString() { 
		return name;
	}
	
	public Signature getSignature(){
		return sig;
	}
}