package exp2;
import java.util.Scanner;
public class Speed {
	private float v,s;
	Scanner sc=new Scanner(System.in);
	public void getv() {
		System.out.println("�������ٶ�");
		v=sc.nextFloat(); 
	}
	public void gets() {
		System.out.println("������·��");
		s=sc.nextFloat(); 
	}
	public void shuchu() {
		System.out.print("����ʱ��Ϊ��");
		System.out.println(s/v);
	}

}
