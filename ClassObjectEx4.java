public class ClassObjectEx4 {
	public static void main(String agrs[])
	{
		Employeeee a = new Employeeee();
		Employeeee b = new Employeeee();
		Employeeee c = new Employeeee();
		Employeeee d = new Employeeee();
		
		a.input();
		b.input();
		c.input();
		d.input();
		
		
		a.show();
		b.show();
		c.show();
		d.show();
		
	}

}
class Employeeee{
	private String name;
	private int salary;
	private String cname;
	
	public  void show()
	{
		System.out.println(name+" "+salary+" "+cname);
	}
	void input()
	{
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Please enter Employees details : ");
		
		System.out.println(" Employee Name : ");
		name = sc.next();
		
		System.out.println(" Employee salary : ");
		salary = sc.nextInt();
		
		System.out.println(" Employee company name : ");
		cname = sc.next();
}
	
}
