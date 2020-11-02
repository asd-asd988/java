package exp4;

public class Student {
	private int age;
	private String xh;
	private String name;
	public Student() {								  //重载Student
		xh="000000";
		name="无名";
		age=19;
	}
	public Student( String name, int age, String xh) {//重载Student
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
	public void showdata() {						//显示数据
	System.out.println("名字为"+getname());
	System.out.println("年龄为"+getage());
	System.out.println("学号为"+getxh());
	}
}
