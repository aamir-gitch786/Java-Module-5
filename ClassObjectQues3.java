public class ClassObjectQues3 {
	
	public static void main(String agrs[])
	{
		AAAA a = new AAAA();
		a.x = 10;
		a.m();
		
		AAAA b = new AAAA();
		b.y = "RAM";
		b.m();
		b.x = 90;
		
		a.printf();
		b.printf();
	}

}
class AAAA{
	int x;
	String y;
	
	void m()
	{
		System.out.println("Hello");
	}
	void printf()
	{
		System.out.println(x+y);
	}
}