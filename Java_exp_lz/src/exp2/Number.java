package exp2;
import java.util.Scanner;
public class Number {
	Scanner sc=new Scanner(System.in);
	private int j,left,right;
	public void judge() {
		System.out.print("��߽磺");
		left=sc.nextInt();
		System.out.print("�ұ߽磺");
		right=sc.nextInt();
		for(int n=left;n<=right;n++) {               //ѭ������������ж���������
			if(n>0&&n%2==1) {
				j++;
			}
		}	
	}
	public void shownum() {
		System.out.println("������"+j+"��");

	}
}
	///	int[] odd=new int[5];
	/*	while(true) {                        //�ж�һ�����Ƿ�Ϊ����
			System.out.println("��������������");
			n=sc.nextInt();
			if(n>0) break;
		}
		if(n%2==1) {
			System.out.println("�������������");
		}else {
			System.out.println("�������ż����");
		}*/