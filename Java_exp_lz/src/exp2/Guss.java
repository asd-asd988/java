package exp2;
import java.util.Scanner;
import java.util.Random;
public class Guss {
	private int a,b;
	Random ra=new Random();
	private Scanner sc;
	public void gss() {
		a=ra.nextInt(10);
		while(true) {
			System.out.println("请写出你的数字：");
			sc = new Scanner(System.in);
			b=sc.nextInt();
			if(a>b) {
				System.out.println("猜小了QAQ，，再来");
			}else if(a<b){
				System.out.println("猜大了QAQ，，再来");
			}else {
			System.out.println("恭喜谜你猜对了");
			break;
			}
		}
	}	
}
