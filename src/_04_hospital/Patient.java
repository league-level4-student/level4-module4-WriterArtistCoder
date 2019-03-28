package _04_hospital;

public class Patient {

	private boolean feelsCaredFor;
	
	public Patient() {
		feelsCaredFor = false;
	}

	public boolean feelsCaredFor() {
		return feelsCaredFor;
	}

	public void checkPulse() {
		this.feelsCaredFor = true;
	}

}
