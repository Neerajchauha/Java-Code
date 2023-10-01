package eclipsproject;
class Employees{
	private String name;
	private int salary =90000;
	private String cname;
	public void show() {
		System.out.println(name+" "+ salary+ " "+cname);
	}
	void input (String n, int s, String c) {
		name=n;
		salary=s;
		cname=c;
	}
}
public class ClassObjectEx3 {

	public static void main(String[] args) {
		Employees a=new Employees();
		Employees b=new Employees();
		Employees c=new Employees();
		Employees d=new Employees();
		a.input("neeraj chauha", 180000,"mahendraTech");
		b.input("sachin", 190000,"tcs");
		c.input("rohan",200000,"adob");
		d.input("navaneet", 210000, "amezon");
		a.show();
		b.show();
		c.show();
		d.show();
		
	}

}
