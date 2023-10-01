package eclipsproject;
class EMPS{
	String name;
	EMPS(){
		System.out.println("hello emps");
		name ="rahul";
	}
	static {
		System.out.println();
	}
	{
		System.out.println("i am emps");
	}
}
public class intializeblockAssignment {

	public static void main(String[] args) {
		EMPS e1=new EMPS();
		EMPS e2=new EMPS();
		System.out.println();
	}

}
