package exp3;

public class Example {

	public static void main(String[] args) {
		System.out.println(add(3,4));
		System.out.println(add(3.13,4.87));
		System.out.println(add(3,4,6));
		System.out.println(add("haha","lili"));
		System.out.println(add(true,false));
	}

	private static boolean add(boolean b, boolean c) {
		return b&&c;
	}
	
	public static int add(int x, int y ) {
		return x+y;
	}
	
	public static double add(double x,double y ) {
		return x+y;
	}
	
	public static int add(int x, int y,int z ) {
		return x+y+z;
	}
	
	public static String add(String x,String y) {
		return x+y;
	}
	
}
