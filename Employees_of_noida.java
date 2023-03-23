
 public class Employees_of_noida{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Employee a =	new Employee();
	Employee b =	new Employee();
	System.out.println(a.name+" "+a.salary+" "+a.Company_name);
	System.out.println(b.name+" "+b.salary+" "+b.Company_name);
	
	a.name="Aamir";
	a.salary = 100000;
	a.Company_name = "Google";
	 
	System.out.println(a.name+" "+a.salary+" "+a.Company_name);
	System.out.println(b.name+" "+b.salary+" "+b.Company_name);
		

	}

} 
 class Employee{
	String name;
	int salary ;
	String Company_name;
	
	
}
