package eclipsproject;
class Humans{
	String name;
	int age;
	void Show() {
		System.out.println(name+" "+age);
	}
	Humans(String n, int a){
		System.out.println("hello Human");
		name=n;
		age =a;
	}
	Humans(){
		System.out.println("hello human");
	}
	{
		System.out.println("INCAPP");
	}
}
public class initializeBlock {
	public static void main(String[] args) {
		Humans p1 =new Humans("gogo",45);
		Humans p2=new Humans();
		Humans p3 =new Humans("jojo",12);
		p1.Show();
		p2.Show();
		p3.Show();
		

	}

}
