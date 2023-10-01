package eclipsproject;
class Empp{
	String name;
	int salary;
	static String cname="ABC";
	void show() {				
		System.out.println(name+" "+salary+" "+cname);
	}
	void input(String n,int s) {
		name=n;
		salary=s;
	}
	static void display() {
		System.out.println("Hi Employee");
		System.out.println(cname);
		//System.out.println(name);//error
	}
}
public class Staticmethodex1 {
	public static void main(String[] args) {
				Empp.display();
				Empp a=new Empp();
				Empp b=new Empp();
				Empp c=new Empp();
				Empp d=new Empp();
				
				a.input("Yoyo Gupta", 78000);
				b.input("Teja Khan", 90000 );
				c.input("Kaliya", 6300);
				d.input("Rajnikant", 10000000);

				//Empp.display();allowed hai
				//a.display();
				
				a.show();
				b.show();
				c.show();
				d.show();
				
				Empp.display();
			}
		}
