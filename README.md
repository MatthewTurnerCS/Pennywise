# Pennywise
Fuzzer for SMT formulas in the theory of FP

Pennywise is based on FuzzSMT, written by Robert Brummayer and Armin Biere as a follow-up to their 2009 paper 
*Fuzzing and Delta Debugging SMT Solvers*.

See also: http://fmv.jku.at/brummayer/talks/Brummayer-SMT09-talk.pdf

Pennywise is limited to the theory of floating point, defined here: http://smtlib.cs.uiowa.edu/theories-FloatingPoint.shtml
It does not support all of the sort conversions, but it does support operations and included parameters for fine-tuning what kinds
of nodes are generated.

Pennywise uses the smt-lib-version 2.5 syntax for the generated formulae. 
The intention is that the output can be used to verify solvers implementing the theory give consistent results.

So far, it has been tested using:
Z3: https://github.com/Z3Prover/z3
MathSAT5: http://mathsat.fbk.eu/
