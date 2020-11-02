package exp2;
import java.util.Scanner;
public class BMI {
	Scanner sc=new Scanner(System.in);
	private double Kg,m,bmi;
	public void getKg() {
		System.out.println("请输入体重"); //过轻：低于18.5
		Kg=sc.nextDouble();            //正常：18.5-23.99
	}								   //过重：24-28
	public void getm() {		       //肥胖：28-32
		System.out.println("请输入身高"); //非常肥胖：高于32
		m=sc.nextDouble();
	}
	public void showBIM() {
		System.out.println("BIM值为：");
		bmi=Kg/Math.pow(m, 2);
		if(bmi<18.5) {
			System.out.println("你的BMI为"+bmi);
			System.out.println("你的体重过轻。");
		}else if(bmi>=18.5 && bmi<23.99){
			System.out.println("你的BMI为"+bmi);
			System.out.println("你的体重正常。");
		}else if(bmi>=24 && bmi<28){
			System.out.println("你的BMI为"+bmi);
			System.out.println("你的体重过重。");
		}else if(bmi>=28 && bmi<32){
			System.out.println("你的BMI为"+bmi);
			System.out.println("你的体重肥胖。");
		}else{
			System.out.println("你的BMI为"+bmi);
			System.out.println("你非常肥胖。");
		}
	}
}
