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
		zhanghu="无账户名";
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
	public void cunkuan(int miane) {							//存款
		this.sheng+=miane;
		System.out.println("您存入了"+miane);
		System.out.println("您的余额为："+sheng);
	}
	public void qukuan(int miane) {						//取款
		System.out.println("您取出了"+miane);
		this.sheng-=miane;
		System.out.println("您的余额为："+miane);
	}
	public void showdata() {							//显示
		System.out.println("您的账户名为："+zhanghu);
		System.out.println("您的余额为："+sheng);
	}
}
