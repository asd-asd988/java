package exp2;
import java.util.Scanner;
public class Example2 {
	private static Scanner sc;

	public static void main(String[] args) {
		int a;
		while(true) {
			sc = new Scanner(System.in);
			System.out.println("********�ҵ�ʵ��һ���ĸ�С����********");
			System.out.println("1.����С������·�̺��ٶ�������ʱ�䡣");
			System.out.println("2.������������ҿ���֪����Ľ���״��Ŷ��");
			System.out.println("3.���뷶Χ��֪���м���������");
			System.out.println("4.һ��������С��Ϸ");
			System.out.println("5.��ʾ99�˷���");
			System.out.println("6.��λ�����ˮ�ɻ���");
			System.out.println("7.�˳�");
			System.out.println("��ѡ�񼸺��ء�");
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
					System.out.println("��������ȷѡ��");
			}
			if(a==7)
				break;
			System.out.println("���Ƿ����,1.��2.��");
			a=sc.nextInt();
			if(a==1) {
				
			}else {
				break;
			}
		
		}
	}
}
