package exp2;
import java.util.Scanner;
public class Shuixianhua {
	private int a;
	public void shuixian() {
		System.out.println("������ǧλ���ڵ���");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		    for(int k=0,i=100;i<=a;i++){ 
		      int b = i/100;    
		      int s = (i-100*b)/10;  
		      int g = (i-s*10-b*100);   
		      if(i==g*g*g+s*s*s+b*b*b){ 
		        System.out.print(i+" ");  
		        k++;
		      }
		    }
		    System.out.println();    
		    System.out.println("ˮ�ɻ����ܹ���"+a+"��");  
	}
}
