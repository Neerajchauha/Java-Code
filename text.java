package eclipsproject;
class a{
	int x;
	a(){
		System.out.println("Hi A");
		x=10;
	}
}
class z extends a{
	int y;
	z(){
		System.out.println("Hello B");
		x=15;
	}
	void show() {
		System.out.println(x);
		System.out.println(y);
	}
}
class text {
	public static void main(String[] args) {
		z z=new z();
		z.show();

	}

}
