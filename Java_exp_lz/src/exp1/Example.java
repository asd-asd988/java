package exp1;
import java.util.Scanner;
public class Example {
	private static Scanner sc;

	public static void main (String[] args) {
		System.out.println("��ҪѧJAVA");
		System.out.println("���������������ҽ����ӷ�����:");
		sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.print(a+b);
	}

}