package altaqor.assignments.assignment10;

public class Student {
	
	public String setStudentInfo(String name) {
		return name;
		
	}
	protected int getStudentInfo(int a) {
		return a;
	}
	
	public void getAddress() {
		String address = "Omaha, NE";
		System.out.println("Student addrerss: "+ address + "\n");
		
	}
	
	public String setAddress(String address1) {
		return address1;
	}
	
	void getStudentCount() {
		int  totalStudent = 900;
		System.out.println("Total Student:    " + totalStudent + "\n");
		
	}
	
	protected int setStudentCount(int b) {
		return b;
	}

}
