package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

	private ArrayList<Patient> patients;
	private ArrayList<Doctor> doctors;
	
	public Hospital() {
		patients = new ArrayList<>();
		doctors = new ArrayList<>();
	}

	public void addPatient(Patient patient) {
		patients.add(patient);
	}

	public List<Patient> getPatients() {
		return patients;
	}
	
	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

}
