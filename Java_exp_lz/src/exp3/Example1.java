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
		System.out.println("请设置这20个球的颜色；");
		System.out.println("r为红色，y为黄色，b为蓝色；");
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
			System.out.println("在这20个球中");
	    	System.out.println("红色的球有"+r+"个");
	    	System.out.println("黄色的球有"+y+"个");
	    	System.out.println("蓝色的球有"+b+"个");

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
		System.out.println("在随机抽取的10个球中");
		System.out.println("红色的球有"+r+"个");
        System.out.println("黄色的球有"+y+"个");
        System.out.println("蓝色的球有"+b+"个");
        int max=r;
        if(max<y) max=y;
        if(max<b) max=b;
        System.out.println("颜色最多的球有"+max+"个");
        int min=r;
        if(min>y) min=y;
        if(min>b) min=b;
        System.out.println("颜色最少的球有"+min+"个");
        }

}