package _04_hospital;

public class GeneralPractitioner extends Doctor {

	@Override
	public boolean performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return true;
	}

}
