
public class LittleAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp obj1 = new Emp();
		obj1.show();
		obj1.input("Aamir",680,"Amazon");
		obj1.show();

	}

}
class Emp{
	String name;
	int salary;
	String companyName;
void show() {
		System.out.println(name + " "+ salary +" "+companyName);
	}
	void input(String name1, int salary1, String companyName1)
	{
		name = name1;
		salary = salary1;
		companyName = companyName1;
		System.out.println(123+"Aamir");
		//System.out.println(name+" "+salary+" "+companyName);
		
	}
}
