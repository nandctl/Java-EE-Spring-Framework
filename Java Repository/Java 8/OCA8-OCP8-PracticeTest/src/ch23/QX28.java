package ch23;

public class QX28 {

	// Which can fill in the blank JavaProgrammerCert class to compile and
	// logically complete the code? (Choose two.)

}

class JavaProgrammerCert extends Exam {
	private Exam oca;
	private Exam ocp;
	// assume getters and setters are here

//	 public boolean passed() {
//		 return oca.passed() && ocp.passed();
//	 }
	 
	 public boolean passed() {
		 return oca.pass && ocp.pass;
	 }
	
}

class Exam {
	boolean pass;

	protected boolean passed() {
		return pass;
	}
}
