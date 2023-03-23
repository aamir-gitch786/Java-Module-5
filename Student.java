
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My_details a = new My_details();
		My_details b = new My_details();
		My_details c = new My_details();
  
a.name = "Aamir";
a.father_name = "Abdul kadir";
a.Mother_name = "Rehana khatoon";
a.Mobile_number = "6200305153";
a.pin_code = "848208";
a.roll_number = 54;


System.out.println(a.name+" "+a.father_name+" "+a.Mobile_number+" "+a.Mother_name+" "+a.pin_code+" "+a.roll_number+" "+a.B);
System.out.println(b.name+" "+b.father_name+" "+b.Mobile_number+" "+b.Mother_name+" "+b.pin_code+" "+b.roll_number);
System.out.println(c.name+" "+c.father_name+" "+c.Mobile_number+" "+c.Mother_name+" "+c.pin_code+" "+c.roll_number);

	}

}
class My_details{
	String name;
	String father_name;
	String Mother_name;
	String Mobile_number;
	String pin_code;
	int roll_number;
	boolean B;
}