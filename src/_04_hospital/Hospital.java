package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> doctors=new ArrayList<Doctor>();
	ArrayList<Patient> patients=new ArrayList<Patient>();
	
	public void addDoctor(Doctor e){
		doctors.add(e);
	}
	public void addPatient(Patient e) {
		patients.add(e);
	}
	public ArrayList<Doctor> getDoctors(){
		return doctors;
		
	}
	public ArrayList<Patient> getPatients(){
		return patients;
		
	}
	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		for(int i=0;i<patients.size();i++) {
			for(int x=0;x<doctors.size();x++) {
				if(doctors.get(x).assignedPatients.size()==3) {
					
				}
				else {
					try {
						doctors.get(x).assignPatient(patients.get(i));
					} catch (DoctorFullException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				break;
				}
			}
		}
	}
}
