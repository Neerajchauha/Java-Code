package eclipsproject;
class Animales{
	String name;
	int age;
	void show() {
		System.out.println(name+" "+age);
	}
	Animales(String n, int a){
	this();
	System.out.println("hello Animal");
	name =n;
	age=a; 
	}
	Animales(){
		System.out.println("hi Animal");
	}
	{
	System.out.println("incapp");
}}
public class initializeBlockEx {
	public static void main(String[] args) {
		Animales p1=new Animales("gogo", 45);
		p1.show();
	}

}
