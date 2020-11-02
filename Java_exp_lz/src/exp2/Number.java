package exp2;
import java.util.Scanner;
public class Number {
	Scanner sc=new Scanner(System.in);
	private int j,left,right;
	public void judge() {
		System.out.print("左边界：");
		left=sc.nextInt();
		System.out.print("右边界：");
		right=sc.nextInt();
		for(int n=left;n<=right;n++) {               //循环输入五个数判断奇数几个
			if(n>0&&n%2==1) {
				j++;
			}
		}	
	}
	public void shownum() {
		System.out.println("奇数有"+j+"个");

	}
}
	///	int[] odd=new int[5];
	/*	while(true) {                        //判断一个数是否为奇数
			System.out.println("请输入正整数数");
			n=sc.nextInt();
			if(n>0) break;
		}
		if(n%2==1) {
			System.out.println("这个数是奇数数");
		}else {
			System.out.println("这个数是偶数数");
		}*/