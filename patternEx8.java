package eclipsproject;

public class patternEx8 {

	public static void main(String[] args) {
		int a=9, b=1;
		for(int x=1; x<=a; x++) {
			for(int y=1; y<=b; y++) {
				System.out.print("*");
			}
			if(x<=a/2) {
				b++;
			}else {
				b--;
			}
			System.out.println();
		}
	}

}
