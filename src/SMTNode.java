/*  Pennywise: A tool for fuzzing SMT solvers in the theory of FP.
 *  Written by Sam Olds and Matthew Turner. 
 * 
 *  Pennywise is based on FuzzSMT:
 *	FuzzSMT: Fuzzing tool for Satisfiablity Modulo Theories (SMT) benchmarks.
 *  Copyright (C) 2009  Robert Daniel Brummayer
 */
public class SMTNode
{
	protected static int nodeCtr = 0;

	protected SMTType type;
	protected String name; 


	public SMTNode (SMTType type, String name){
		this.type = type;
		this.name = name;
		nodeCtr++;
	}

	public SMTType getType(){
		return this.type;
	}

	public String getName (){
		return this.name;
	}

	public static int getNodeCtr (){
		return nodeCtr;
	}

}