class M{
	int a = 90;
	String b = "Ram";
	
	void show()
	{
		a++;
		System.out.println(a+b);
	}
}
public class ClassObjectQues5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        M obj1 = new M();
        M obj2 = new M();
        obj1.show();
        obj1.show();
        obj2.show();
	}

}
