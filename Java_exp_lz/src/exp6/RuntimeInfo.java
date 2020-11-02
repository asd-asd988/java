package exp6;
import java.util.*;
import java.text.*;


public class RuntimeInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Class类与Object类的使用
	    String str = new String("");
	    System.out.println("str对象的类名："+str.getClass());

	//System类的使用
	    System.out.println("操作系统属性："+System.getProperties());
	// Runtime类的使用
	    System.out.println("内存总量："+Runtime.getRuntime().maxMemory()/1024/1024+"m");
	    System.out.println("空闲内存总量："+Runtime.getRuntime().freeMemory()/1024/1024+"m");
	    Runtime.getRuntime().gc();  //要求运行垃圾回收器，相当于 System.gc();

	    System.out.println("\n运行垃圾回收器后");
	    System.out.println("内存总量："+Runtime.getRuntime().maxMemory()/1024/1024+"m");
	    System.out.println("空闲内存总量："+Runtime.getRuntime().freeMemory()/1024/1024+"m");
	  
	}

	}

