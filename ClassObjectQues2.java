public class ClassObjectQues2 {
	
	  public static void main(String agr[])
	        {
		        AA a = new AA();
		        a.a = 10;
		        AA b = new AA();
		        b.b = "Aamir";
		        
		        AA c = new AA();
		        c.a = 50;
		        a.c();
		        b.c();
		        c.c(); 
	        }
}

class AA{
	int a;
	
	String b;
	
	void c(){
		     System.out.println(a+b);
	       }
}