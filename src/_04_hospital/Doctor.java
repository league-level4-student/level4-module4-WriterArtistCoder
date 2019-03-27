package _04_hospital;

public class Doctor {
	
	private static boolean performsSurgery;
	private static boolean makesHouseCalls;
	
	public Doctor() {
		performsSurgery = false;
		makesHouseCalls = false;
	}
	
	public Doctor(boolean surgery, boolean houseCalls) {
		performsSurgery = surgery;
		makesHouseCalls = houseCalls;
	}
	
	public boolean performsSurgery() {
		return performsSurgery;
	}

	public boolean makesHouseCalls() {
		return makesHouseCalls;
	}
	
}
