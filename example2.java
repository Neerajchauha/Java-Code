package eclipsproject;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10, b;
         b=++a-a;
         System.out.println( "1a="+a);
         System.out.println("1b="+ b);
        b=++a-a+a++;
        System.out.println("2a="+ a);
        System.out.println("2b="+ b);
        
        b=a--+a++-a+a++;
        System.out.println("3a="+ a);
        System.out.println("3b="+ b);
        b=--a+a++-a--+a;
        System.out.println("4a="+a);
        System.out.println("4b="+b);
        b=a++-++a+a--+a--+--a;
       System.out.println("5a="+a);
        System.out.println("5b="+b);
	}

}
