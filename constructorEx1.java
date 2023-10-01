package eclipsproject;
class Employers{
	String name;
	int age;
	void show() {
		System.out.println(name+" "+age);
	}
	Employers(String n,int a){
		this();//constructor chaining statement
		System.out.println("Hello Employers");
		name=n;
		age=a;
	}
	Employers(){
		System.out.println("Hi Employers");
	}
}
public class constructorEx1 {

	public static void main(String[] args) {
		
		Employers a1=new Employers("Gogo",5);
		a1.show();
	}

}
