
public class Test4 {
	int p=1;
	public void m(int x) {
	p=x;
	}
	public static void main(String[] args) 
	{
		Test4  d= new Test4 ();
	    d.p=3;
	    System.out.println(d.p);
	    d.m(4);
	    System.out.println(d.p);
	}

}
