/*  Pennywise: A tool for fuzzing SMT solvers in the theory of FP.
 *  Written by Sam Olds and Matthew Turner. 
 * 
 *  Pennywise is based on FuzzSMT:
 *	FuzzSMT: Fuzzing tool for Satisfiablity Modulo Theories (SMT) benchmarks.
 *  Copyright (C) 2009  Robert Daniel Brummayer
 */

import java.util.*;

public class Signature {

	protected List<SMTType> operandTypes;

	protected SMTType resultType;

	public Signature (List<SMTType> operandTypes, SMTType resultType){
		assert (operandTypes != null);
		assert (resultType != null);
		this.operandTypes = operandTypes;
		this.resultType = resultType;
	}

	public List <SMTType> getOperandTypes() {
		return this.operandTypes;
	}

	public SMTType getResultType() {
		return this.resultType;
	}

}