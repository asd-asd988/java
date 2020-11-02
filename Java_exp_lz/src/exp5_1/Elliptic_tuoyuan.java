package exp5_1;

import java.util.Scanner;

public class Elliptic_tuoyuan implements Area {

	private double a,b,area;
	public Elliptic_tuoyuan(double a,double b) {
		this.a=a;
		this.b=b;
	}
	public Elliptic_tuoyuan() {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入长轴：");
		a=sc.nextDouble();
		System.out.println("请输入短轴：");
		b=sc.nextDouble();
	}
	public void SuanArea() {
		area=3.14*a*b;
	}
	public void show() {
		System.out.println("面积是："+area);
	}

}
