
public class ClassObjectEx3 {
   
	public static void main(String agrs[])
                     {
	                  Employeee a = new Employeee();
	                  Employeee b = new Employeee();
	                  Employeee c = new Employeee();
	                  Employeee d = new Employeee(); 
		           
	                  
	                  a.input("Aamir", 1000, "Nokia");
	                  b.input("Rupesh", 2000, "TCS");
	                  c.input("Rahul", 3000, "Facebook");
	                  d.input("Ankush", 4000, "Infosys");
	                  
	                  a.show();
	                  b.show();
	                  c.show();
	                  d.show();
	                  
	                  
//a.name ="Aamir";   Error -->because name is private !.
//we can't access private member of class in their object.
	                  
	                 
                     }
}
class Employeee {
	private String name;
	private int salary;
	private String cname;
	
    public void show()
	{
		System.out.println(name+ " "+salary+" "+cname );
	}
	void input(String n, int s , String c)
	{
		name = n;
		salary = s;
		cname = c;
		
	}
}