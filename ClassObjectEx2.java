package eclipsproject;
class Emp{
	//system.out.println("hello emp");//error
	void m() {
		System.out.println("hello Emp");
	}
	String name;
	//int salary=90000; //allowed
	int salary;
	//salary=90000;//error
	void setsalary() {
		salary=90000;
	}
	String cname;
	void show() {
		System.out.println(name+" "+ salary+" "+cname);
	}
	void input(String n , int s, String c) {
		name =n;
		salary=s;
		cname=c;
	}
}
public class ClassObjectEx2 {

	public static void main(String[] args) {
		Emp a=new Emp();
		Emp b=new Emp();
		Emp c=new Emp();
		Emp d=new Emp();
		a.setsalary();
		a.show();
		b.show();
		c.show();
		d.show();
		a.m();
		a.input("neeraj chuahan", 180000, "amezon" );
		b.input("sachin", 200000, "Adob" );
		c.input("Rohan", 190000, "TCS" );
		d.input("navaneet", 210000, "microsoft" );
		a.show();
		b.show();
		c.show();
		d.show();
		int total= a.salary+b.salary+c.salary+d.salary;
		System.out.println("Total salary"+total);
		a.m();
	}

}
