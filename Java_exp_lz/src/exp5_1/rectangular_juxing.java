package exp5_1;

import java.util.Scanner;

public class rectangular_juxing implements Area {

	private double a,b,area;
	public rectangular_juxing (double a,double b) {
		this.a=a;
		this.b=b;
	}
	public rectangular_juxing () {
		Scanner sc= new Scanner(System.in);
		System.out.println("请输入长：");
		a=sc.nextDouble();
		System.out.println("请输入宽：");
		b=sc.nextDouble();
	}
	public void SuanArea() {
		area=a*b;
	}
	public void show() {
		System.out.println("面积是："+area);
	}
}
