
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    EmployeesDetails obj1 = new EmployeesDetails();
    EmployeesDetails obj2 = new EmployeesDetails();
    obj1.input("Aamir",1000,"Zuno");
    obj2.input("Asif",2000,"Apple");
    
    obj1.show();
    obj2.show();
	}

}

class EmployeesDetails{
	String name;
	int rollNumber;
	String companyName;
	void show()
	{
		System.out.println(name+" "+rollNumber+" "+companyName);
	}
	
	void input(String a , int b , String c)
	{
		name = a;
		rollNumber = b;
		companyName = c;
	}
}