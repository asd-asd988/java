package exp6;
import java.util.*;
import java.text.*;


public class RuntimeInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Class����Object���ʹ��
	    String str = new String("");
	    System.out.println("str�����������"+str.getClass());

	//System���ʹ��
	    System.out.println("����ϵͳ���ԣ�"+System.getProperties());
	// Runtime���ʹ��
	    System.out.println("�ڴ�������"+Runtime.getRuntime().maxMemory()/1024/1024+"m");
	    System.out.println("�����ڴ�������"+Runtime.getRuntime().freeMemory()/1024/1024+"m");
	    Runtime.getRuntime().gc();  //Ҫ�������������������൱�� System.gc();

	    System.out.println("\n����������������");
	    System.out.println("�ڴ�������"+Runtime.getRuntime().maxMemory()/1024/1024+"m");
	    System.out.println("�����ڴ�������"+Runtime.getRuntime().freeMemory()/1024/1024+"m");
	  
	}

	}

