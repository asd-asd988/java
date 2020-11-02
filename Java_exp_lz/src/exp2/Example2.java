package exp2;
import java.util.Scanner;
public class Example2 {
	private static Scanner sc;

	public static void main(String[] args) {
		int a;
		while(true) {
			sc = new Scanner(System.in);
			System.out.println("********我的实验一有四个小功能********");
			System.out.println("1.输入小汽车的路程和速度求所用时间。");
			System.out.println("2.输入你的体重我可以知道你的健康状况哦。");
			System.out.println("3.输入范围我知道有几个奇数。");
			System.out.println("4.一个猜数的小游戏");
			System.out.println("5.显示99乘法表");
			System.out.println("6.百位以外的水仙花数");
			System.out.println("7.退出");
			System.out.println("你选择几号呢。");
			a=sc.nextInt();
			switch(a) {
				case 1:
					Speed sudu=new Speed();
					sudu.gets();
					sudu.getv();
					sudu.shuchu();
					break;
				case 2:
					BMI b=new BMI();
					b.getKg();
					b.getm();
					b.showBIM();
					break;
				case 3:
					Number number=new Number();
					number.judge();
					number.shownum();
					break;
				case 4:
					Guss gu=new Guss();
					gu.gss();
					break;
				case 5:
					Chengfabiao c=new Chengfabiao();
					c.show99();
					break;
				
				case 6:	
					Shuixianhua shui=new Shuixianhua();
					shui.shuixian();
					break;
				case 7:
					break;
				default :
					System.out.println("请输入正确选项");
			}
			if(a==7)
				break;
			System.out.println("你是否继续,1.是2.否");
			a=sc.nextInt();
			if(a==1) {
				
			}else {
				break;
			}
		
		}
	}
}
