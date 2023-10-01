package eclipsproject;
class Addition{
	void add(int x, int y) {
		int r=x+y;
		System.out.println("Addition= "+r);
	}
	static void add(String x, String y) {
		String r =x+y;
		System.out.println("Addition="+r);
	}
	void add(double x,double y) {
		double r= x+y;
		System.out.println("Addition = "+r);
	}
}
public class CompileTimepolymorpismEx1 {

	public static void main(String[] args) {
		Addition a=new Addition();
		a.add(56, 54);
		a.add(5.6,1.4);
		a.add("Hello", "hi");
		a.add(43, 8);
		

	}

}
