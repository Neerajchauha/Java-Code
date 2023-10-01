package eclipsproject;
class QQ{
	int x;
	QQ(){
		this (2);
		System.out.println("hi a");
	}
	QQ(int a){
		x=a;
		System.out.println("hello a");
	}
}
class BB extends QQ{
	 BB(){
		System.out.println("hi B");
	}
}
 class inheritancequestionEx2 {

	public static void main(String[] args) {
		BB b=new BB();
		System.out.println(b.x);
	}

}
