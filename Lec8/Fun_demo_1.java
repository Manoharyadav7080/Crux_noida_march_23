package Lec8;


public class Fun_demo_1 {
	static  int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int a = 9;
		int b = 7;
		System.out.println(val);
		System.out.println(add (a,b));
		System.out.println(val);
		
		
	}
	public static int add(int a , int b ) {
		int c = a+b;
		val = val +5;
		return c ;
	}
	

}
