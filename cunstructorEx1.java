package eclipsproject;
class Animals{
	String name;
	int age;
	void show() {
		System.out.println(name+age);
	}
	Animals(){
		System.out.println("hello Animal");
		name="Dog";
		age=10;
	}
}
public class cunstructorEx1 {

	public static void main(String[] args) {
		Animals a1=new Animals();
		//a1.Animal();//error
		Animals a2=new Animals();
		Animals a3=new Animals();
		//Animal a4=new Animal("Cat",8);//error
		a1.show();
		a2.show();
		a3.show();
	}

}
