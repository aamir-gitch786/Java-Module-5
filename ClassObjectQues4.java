public class ClassObjectQues4{
	   int x;
	   String y;
	   private void show()
	   {
		   System.out.println(x+y);
	   }
	public static void main(String agrs[])
	{
		ClassObjectQues4 a = new ClassObjectQues4();
		a.x = 10;
		a.y ="RCB";
		ClassObjectQues4 b = new ClassObjectQues4();
		b.y = "MI";
		b.x = 100;
		
		a.show();
		b.show();
	}
}
/*when we use private key word then the access of that variable 
only privent outside of that class so we can easily access those members 
in side the class . OKay !  😅

*/