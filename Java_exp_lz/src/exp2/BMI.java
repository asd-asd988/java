package exp2;
import java.util.Scanner;
public class BMI {
	Scanner sc=new Scanner(System.in);
	private double Kg,m,bmi;
	public void getKg() {
		System.out.println("����������"); //���᣺����18.5
		Kg=sc.nextDouble();            //������18.5-23.99
	}								   //���أ�24-28
	public void getm() {		       //���֣�28-32
		System.out.println("���������"); //�ǳ����֣�����32
		m=sc.nextDouble();
	}
	public void showBIM() {
		System.out.println("BIMֵΪ��");
		bmi=Kg/Math.pow(m, 2);
		if(bmi<18.5) {
			System.out.println("���BMIΪ"+bmi);
			System.out.println("������ع��ᡣ");
		}else if(bmi>=18.5 && bmi<23.99){
			System.out.println("���BMIΪ"+bmi);
			System.out.println("�������������");
		}else if(bmi>=24 && bmi<28){
			System.out.println("���BMIΪ"+bmi);
			System.out.println("������ع��ء�");
		}else if(bmi>=28 && bmi<32){
			System.out.println("���BMIΪ"+bmi);
			System.out.println("������ط��֡�");
		}else{
			System.out.println("���BMIΪ"+bmi);
			System.out.println("��ǳ����֡�");
		}
	}
}
