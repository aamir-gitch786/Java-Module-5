class Empp{
/*
 -->  System.out.println("Aamir");// Error 
    becuase it is a action statement .
  
  Only two type of statement is allowed in class.
	1. Declaration
	eg: int a ; String b etc .
	
	2.Declaration with initialization
	eg: int a = 1000 ; String b ="Aamir" etc.
  
 */
/*	
1. Not Allowed
	int salary ;
	salary = 1000;//Error 
	
	
2.Allowed.	
	int salary = 1000;
	String cname = "Aamir"+salary;//Allowed
	
 	
 3. Not Allowed.
	String cname = "Aamir"+salary;
	int salary = 1000;//Error

--> because in case of instance variable order matters.
*/	
  String name;
  int salary = 1000;
  String cname = "ABC"+salary;
  
	void m()
	  {
	 	System.out.println("Hello m method.");
	  }
	
	void show()
	  {
		System.out.println(name+" "+salary+" "+cname);
	  }
	
	void input(String n, int s, String c)
	  {
		name = n;
		salary = s;
		cname = c;
	  }
	
	}


public class ClassObjectEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Empp a = new Empp();
      Empp b = new Empp();
      Empp c = new Empp();
      Empp d = new Empp();
      
      a.m();
      
      
      a.show();
      b.show();
      c.show();
      d.show();
      
      a.input("Aamir", 1000, "Nokia");
      b.input("Nitesh", 2000, "TCS");
      c.input("Rahul",3000,"Infosys");
      d.input("Chintu", 1900, "Zuno");
      
      a.name ="Asif";
      
      a.show();
      b.show();
      c.show();
      d.show();
      
      int total=a.salary+b.salary+c.salary+d.salary;
		System.out.println("Total Salary: "+total);
		
		a.m();
	}

}
