package exp4;
import java.util.Scanner;
public class Example {

	public static void main(String[] args) {
		/*Student stu1=new Student();
		Student stu2=new Student("lz",21,"0019");
		Student stu3=new Student();
		stu1.setage(23);
		stu1.setname("����");
		stu1.setxuehao("200804201");
		stu1.showdata();
		stu2.showdata();
		stu3.showdata();*/
		int a;
		String b;
		Bankmini bank1=new Bankmini(0,"lz","000000");
		Scanner sc=new Scanner(System.in);
		Scanner p=new Scanner(System.in);
		System.out.println("�����˻����������˻�����");
		b=p.nextLine();
		bank1.setzhanghu(b);
		System.out.println("�������룬���������룺");
		b=p.nextLine();
		bank1.setpassword(b);
		System.out.println("���������룺");
		b=p.nextLine();
		while(b.equals(bank1.getpassword())) {
		System.out.println("����������Ҫ�Ĳ�����1.��� 2.ȡ��3.�޸�����4.�˳�");
		a=sc.nextInt();
		switch(a){
		case 1:{
		System.out.println("�������");
		a=sc.nextInt();
		bank1.cunkuan(a);
		break;
		}
		case 2:{
		System.out.println("�������");
		a=sc.nextInt();
		bank1.qukuan(a);
		break;
		}
		case 3:{
		System.out.println("������Ҫ�޸ĵ�����");
		b=p.nextLine();
		bank1.setpassword(b);
		break;
		}
		case 4:break;
		}
		if(a==4) {break;}
	} 
		System.out.println("���˳�");
	}
}