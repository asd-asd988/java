package exp3;

import java.util.Scanner;
import java.util.Random;

public class Example1 {

	public static void main(String[] args) {
		String[] ball = new String[20];
		setball(ball);
		countcolors(ball);
		countBall(ball);
	}
	public static void setball(String[] ball) {
		System.out.println("��������20�������ɫ��");
		System.out.println("rΪ��ɫ��yΪ��ɫ��bΪ��ɫ��");
		for(int i=0;i<ball.length;i++) {
			Scanner sc=new Scanner(System.in);
			System.out.print(i+1);
			ball[i]=sc.next();
		}
	}
	public static void countcolors(String[] ball) {
		int r=0,y=0,b=0;
		for(int i=0;i<ball.length;i++) {
			if(ball[i].equals("r")) {
				r++;
			}else if(ball[i].equals("y")) {
				y++;
			}else if(ball[i].equals("b")) {
				b++;
			}else {
				continue;
			}
			}
			System.out.println("����20������");
	    	System.out.println("��ɫ������"+r+"��");
	    	System.out.println("��ɫ������"+y+"��");
	    	System.out.println("��ɫ������"+b+"��");

	}
    public static void countBall(String[] ball) {
    	Random rand = new Random();
		int r=0,y=0,b=0;
		for(int i=0;i<10;i++){
			int m = rand.nextInt(19);
    		if(ball[m].equals("r")){
    			r++;
    		}else if(ball[m].equals("y")){    
    			y++;
    		}else if(ball[m].equals("b"))
    			b++;
    	}
		System.out.println("�������ȡ��10������");
		System.out.println("��ɫ������"+r+"��");
        System.out.println("��ɫ������"+y+"��");
        System.out.println("��ɫ������"+b+"��");
        int max=r;
        if(max<y) max=y;
        if(max<b) max=b;
        System.out.println("��ɫ��������"+max+"��");
        int min=r;
        if(min>y) min=y;
        if(min>b) min=b;
        System.out.println("��ɫ���ٵ�����"+min+"��");
        }

}