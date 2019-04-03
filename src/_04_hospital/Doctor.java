package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	
	private boolean performsSurgery;
	private boolean makesHouseCalls;
	private ArrayList<Patient> patients;
	
	public Doctor() {
		performsSurgery = false;
		makesHouseCalls = false;
		patients = new ArrayList<>();
	}
	
	public Doctor(boolean surgery, boolean houseCalls) {
		performsSurgery = surgery;
		makesHouseCalls = houseCalls;
		patients = new ArrayList<>();
	}
	
	public boolean performsSurgery() {
		return performsSurgery;
	}

	public boolean makesHouseCalls() {
		return makesHouseCalls;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		if (patients.size() >= 3) {
			throw new DoctorFullException();
		}
		
		patients.add(patient);
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void doMedicine() {
		for (Patient p : patients) {
			p.checkPulse();
		}
	}
	
}

@SuppressWarnings("serial")
class DoctorFullException extends Exception {
	public DoctorFullException() {
		super();
	}
}
