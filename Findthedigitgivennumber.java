package eclipsproject;

public class Findthedigitgivennumber {

	public static void main(String[] args) {
		 
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println(" enetr a number");
		int num , count =0;
		 num=sc.nextInt();
		
		while(num > 0) {
			//reduce number in each iteration
			num=num/10;
			
			count++;
		}
		System.out.println("the total number is: "+count);
	}
		
	}


