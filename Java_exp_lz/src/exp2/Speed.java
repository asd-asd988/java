package exp2;
import java.util.Scanner;
public class Speed {
	private float v,s;
	Scanner sc=new Scanner(System.in);
	public void getv() {
		System.out.println("请输入速度");
		v=sc.nextFloat(); 
	}
	public void gets() {
		System.out.println("请输入路程");
		s=sc.nextFloat(); 
	}
	public void shuchu() {
		System.out.print("花费时间为：");
		System.out.println(s/v);
	}

}
