package methodConstructor;

public class StudentMain {

	public static void main(String[] args) {
//		Student std = new Student();

		// using object reference variable
/*		std.sid=101;
		std.sname="John";
		std.sgrade='A';
		std.studentData();	*/

		//using method 
/*		std.setStudentData(102, "David", 'A');
		std.studentData();	*/
		
		//using constructor 
		Student std = new Student(102, "David", 'A');
		std.studentData();
		
	}

}
