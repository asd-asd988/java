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
		System.out.println("×ß");
	}

	public void eat() {
		System.out.println("³Ô");
	}

	public void breath() {
		System.out.println("ºôÎü");
	}

	public void study() {
		System.out.println("Ñ§Ï°");
	}

	public void think() {
		System.out.println("Ë¼¿¼");
	}
	public void show() {
		System.out.println(""+name);
	}

}
