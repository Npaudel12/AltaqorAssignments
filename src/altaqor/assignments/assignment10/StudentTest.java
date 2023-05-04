package altaqor.assignments.assignment10;

public class StudentTest {

	public static void main(String[] args) {
		// object of the Student class
		Student student = new Student();
	
		// Calling and printing studentInfo() method
		String stuName = student.setStudentInfo("Narayan Paudel");
		System.out.println("Name of the Student:   " + stuName +"\n");
		
		int stuID = student.getStudentInfo(200);
		System.out.println("Student ID:  "+   stuID + "\n");
		
		// calling getAddress, setAddress method
		student.getAddress(); 
		String stuAddress = student.setAddress("3121 S 69th AVE");
		System.out.println("Student street Address: " + stuAddress + "\n");
		
		// calling get,setStudentCount method
		student.getStudentCount();
		int stuTotal =student.setStudentCount(78999);
	    System.out.println("Grand Total Student:  " +    stuTotal);
	} // end of main method

} //end of class
