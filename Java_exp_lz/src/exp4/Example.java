package exp4;
import java.util.Scanner;
public class Example {

	public static void main(String[] args) {
		/*Student stu1=new Student();
		Student stu2=new Student("lz",21,"0019");
		Student stu3=new Student();
		stu1.setage(23);
		stu1.setname("张三");
		stu1.setxuehao("200804201");
		stu1.showdata();
		stu2.showdata();
		stu3.showdata();*/
		int a;
		String b;
		Bankmini bank1=new Bankmini(0,"lz","000000");
		Scanner sc=new Scanner(System.in);
		Scanner p=new Scanner(System.in);
		System.out.println("设置账户，请输入账户名：");
		b=p.nextLine();
		bank1.setzhanghu(b);
		System.out.println("设置密码，请输入密码：");
		b=p.nextLine();
		bank1.setpassword(b);
		System.out.println("请输入密码：");
		b=p.nextLine();
		while(b.equals(bank1.getpassword())) {
		System.out.println("请输入你想要的操作：1.存款 2.取款3.修改密码4.退出");
		a=sc.nextInt();
		switch(a){
		case 1:{
		System.out.println("请输入金额：");
		a=sc.nextInt();
		bank1.cunkuan(a);
		break;
		}
		case 2:{
		System.out.println("请输入金额：");
		a=sc.nextInt();
		bank1.qukuan(a);
		break;
		}
		case 3:{
		System.out.println("请输入要修改的密码");
		b=p.nextLine();
		bank1.setpassword(b);
		break;
		}
		case 4:break;
		}
		if(a==4) {break;}
	} 
		System.out.println("已退出");
	}
}