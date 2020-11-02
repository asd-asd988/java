package exp1;
import java.util.Scanner;
public class Example {
	private static Scanner sc;

	public static void main (String[] args) {
		System.out.println("我要学JAVA");
		System.out.println("请输入两个数，我将做加法运算:");
		sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.print(a+b);
	}

}