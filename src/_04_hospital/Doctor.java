package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	ArrayList<Patient> assignedPatients=new ArrayList<Patient>();

	public void assignPatient(Patient e) throws DoctorFullException {
		if(this.assignedPatients.size()==3) {
			throw new DoctorFullException();
		}
		else {
			assignedPatients.add(e);
	}
	}

	public ArrayList<Patient> getPatients(){
		return assignedPatients;
		
	}
	public boolean performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}
	public void doMedicine() {
		// TODO Auto-generated method stub
		for(int i=0;i<assignedPatients.size();i++) {
			assignedPatients.get(i).feelsCared=true;
		}
	}
}
