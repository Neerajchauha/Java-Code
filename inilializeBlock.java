package eclipsproject;
class person{
	{
		System.out.println("INCAPP");
	}
	String name;
	int age;
	void show() {
		System.out.println(name+""+age);
	}
	person(){
		System.out.println("hello person");
		name= "ram";
		age =10;
	}
	{
		System.out.println("ok");
	}
}
public class inilializeBlock {
	public static void main(String[] args) {
		person p1=new person();
		person p2 =new person();
		person p3= new person();
		p1.show();
		p2.show();
		p3.show();
	}

}
