package eclipsproject;
class Employer{
	String name;
	int salary;
	static String cname="ABC";
	void show(){
		System.out.println(name+" "+salary+" "+cname);
	}
	public void input(String n,int s) {
		name=n;
		salary=s;
	}
}
public class StaticvariableEX1 {
	public static void main(String[] args) {
		
				//System.out.println(cname);//error
				System.out.println(Employer.cname);
				Employer a=new Employer();
				Employer b=new Employer();
				Employer c=new Employer();
				Employer d=new Employer();
				
				a.input("Cheetah Khan",256000);
				b.input("Yoyo Gupta",125000);
				c.input("Gogo Singh",98000);
				d.input("Teja Seth",780000);

				a.cname="XYZ";
				d.cname="Adob";
				
				a.show();
				b.show();
				c.show();
				d.show();
			}
		}
