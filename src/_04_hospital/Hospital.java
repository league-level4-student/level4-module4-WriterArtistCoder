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

	public void assignPatientsToDoctors() {
		int x = -1;
		for (int i = 0; i < patients.size(); i++) {
			if (i%3 == 0) {
				x++;
			}
			
			try {
				doctors.get(x).assignPatient( patients.get(i) );
			} catch (DoctorFullException e) {
				e.printStackTrace();
			}
		}
	}

}
