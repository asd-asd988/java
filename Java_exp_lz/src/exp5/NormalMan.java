package exp5;

import java.util.Scanner;

public class NormalMan implements Mankind {

	private String name;
	public NormalMan(String name) {
		this.name=name;
	}
	public NormalMan() {
		Scanner sc= new Scanner(System.in);
		name=sc.next();
	}
	public void move() {
		System.out.println("��");
	}

	public void eat() {
		System.out.println("��");
	}

	public void breath() {
		System.out.println("����");
	}

	public void study() {
		System.out.println("ѧϰ");
	}

	public void think() {
		System.out.println("˼��");
	}
	public void show() {
		System.out.println(""+name);
	}

}
