package classObject;

public class EmployeeMain {

	public static void main(String[] args) {
		//Approach1	
				Employee emp1 = new Employee();
				System.out.println("Employee 1 Details");
				emp1.EmpId=101;
				emp1.EmpName="John";
				emp1.EmpJob="IT";
				emp1.Empsalary= 5;
				emp1.displayEmp1();
				
				System.out.println( );
		//Approach2		
				System.out.println("Employee 2 Details");
				Employee emp2 = new Employee();
				emp2.EmpId=102;
				emp2.EmpName="Kerin";
				emp2.EmpJob="IT";
				emp2.Empsalary= 10;
				System.out.println(emp2.EmpId);
				System.out.println(emp2.EmpName);
				System.out.println(emp2.EmpJob);
				System.out.println(emp2.Empsalary);
				
	}

}
