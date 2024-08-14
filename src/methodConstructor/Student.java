package methodConstructor;

public class Student {


	int sid;
	String sname;
	char sgrade;

	void studentData() {
		System.out.println(sid + " " + sname + " " + sgrade);
	}

	//method name is any name
	//	may or may not return any value
	//	store data into variables
	void setStudentData(int id, String name, char grade) {
		sid=id;
		sname=name;
		sgrade=grade;
	}

	//	name should be same as a class name
	//	constructor will not return any value
	//	assigning data into variables
	// used to initialize data into the variables	
	Student(int id, String name, char grade) {
		sid=id;
		sname=name;
		sgrade=grade;
	}
}
