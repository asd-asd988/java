package exp4;
import java.util.Scanner;
public class Bankmini {
	private int sheng=0; 
	private String zhanghu;
	private String password;
	Scanner sc=new Scanner(System.in);
	public Bankmini(int sheng,String zhanghu,String password) {
		this.sheng=sheng;
		this.zhanghu=zhanghu;
		this.password=password;
	}
	public Bankmini() {
		sheng=0;
		zhanghu="���˻���";
		password="000000";
	}

	public void setzhanghu(String zhanghu) {
		this.zhanghu=zhanghu;
	}
	public void setpassword(String password) {
		this.password =password;
	}
	public String getpassword() {
		return password;
	}
	public void cunkuan(int miane) {							//���
		this.sheng+=miane;
		System.out.println("��������"+miane);
		System.out.println("�������Ϊ��"+sheng);
	}
	public void qukuan(int miane) {						//ȡ��
		System.out.println("��ȡ����"+miane);
		this.sheng-=miane;
		System.out.println("�������Ϊ��"+miane);
	}
	public void showdata() {							//��ʾ
		System.out.println("�����˻���Ϊ��"+zhanghu);
		System.out.println("�������Ϊ��"+sheng);
	}
}
