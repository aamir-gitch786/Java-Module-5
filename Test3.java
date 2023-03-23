
public class Test3 {
	private int x;
	public void show() {
	x++;
	System.out.println(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 a= new Test3();
		a.show();
		Test3 b= new Test3();
		a.show();
		b.show();

	}

}
