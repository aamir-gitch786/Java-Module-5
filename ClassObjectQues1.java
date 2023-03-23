class A{
	int x;
	void m()
	{
		System.out.println("Hi m method. "+ x);
	}
}
public class ClassObjectQues1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     A a = new A();
     
      a.x = 10;
     
      a.m();
      
      A b = new A();
      
      b.x = 40 ;
      
      System.out.println(a.x);
      System.out.println(b.x);
	}

}
