package exp4;

public class Student {
	private int age;
	private String xh;
	private String name;
	public Student() {								  //����Student
		xh="000000";
		name="����";
		age=19;
	}
	public Student( String name, int age, String xh) {//����Student
		this.age=age;
		this.xh=xh;
		this.name=name;
	}
	public void setage(int age) {
		this.age=age;
	}
	public void setxuehao(String xh) {
		this.xh=xh;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getage() {
		return age;
	}
	public String getxh() {
		return xh;
	}
	public String getname() {						
		return name;
	}
	public void showdata() {						//��ʾ����
	System.out.println("����Ϊ"+getname());
	System.out.println("����Ϊ"+getage());
	System.out.println("ѧ��Ϊ"+getxh());
	}
}
