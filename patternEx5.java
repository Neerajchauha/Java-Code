package eclipsproject;

public class patternEx5 {

	public static void main(String[] args) {
		int a=5, b=1;
		for(int x=1; x<=a; x++) {
			for(int y=1; y<=b; y++) {
				System.out.print("*");
			}
			b++;
			System.out.println();
		}
	}

}
