package eclipsproject;
class Ql{
	static int x;
	String y="KK";
	void show() {
		System.out.println(x+y);
		x++;
	}
}
public class StaticQues6 {
	public static void main(String[] args) {
				Ql q1=new Ql();
				Ql q2=new Ql();
				q1.show();
				++Ql.x;
				q2.show();
				q1.show();
			}
		}
