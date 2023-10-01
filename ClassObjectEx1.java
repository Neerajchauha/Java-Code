package eclipsproject;

public class ClassObjectEx1 {
	public static void main(String[] args) {
		Employee a=new Employee();
		Employee b=new Employee();
		Employee c=new Employee();
		Employee d=new Employee();
		System.out.println(a);
		System.out.println(a.name+" " +a.salary+" "+a.cname);
		System.out.println(b.name+" "+b.salary+" "+b.cname);
		System.out.println(c.name+" "+c.salary+" "+c.cname);
		System.out.println(d.name+" "+d.salary+" "+d.cname);
		a.name="Neeraj chauhan";
		a.salary=650000;
		a.cname="google";
		b.name="Rohan murya";
		b.salary=650000;
		b.cname="microsoft";
		c.name="sachin";
		c.salary=650000;
		c.cname="tesla";
		d.name="navaneet";
		d.salary=650000;
		d.cname="apple";
		
		
		System.out.println(a.name+" " +a.salary+" "+a.cname);
		System.out.println(b.name+" "+b.salary+" "+b.cname);
		System.out.println(c.name+" "+c.salary+" "+c.cname);
		System.out.println(d.name+" "+d.salary+" "+d.cname);
		int 
		total=a.salary+b.salary+c.salary+d.salary;
		System.out.println("Total salary"+" = "+total);
	}

}
class Employee{
	String name;
	int salary;
	String cname;
}