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
			System.out.println("��д��������֣�");
			sc = new Scanner(System.in);
			b=sc.nextInt();
			if(a>b) {
				System.out.println("��С��QAQ��������");
			}else if(a<b){
				System.out.println("�´���QAQ��������");
			}else {
			System.out.println("��ϲ����¶���");
			break;
			}
		}
	}	
}
