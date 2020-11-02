package exp5_1;

public class Demo {
	public static void main(String[] args) {
		rectangular_juxing r2=new rectangular_juxing(10,11);
		r2.SuanArea();
		r2.show();
		rectangular_juxing r1=new rectangular_juxing();
		r1.SuanArea();
		r1.show();
		Elliptic_tuoyuan t1=new Elliptic_tuoyuan(10,11);
		t1.SuanArea();
		t1.show();
		Elliptic_tuoyuan t2=new Elliptic_tuoyuan();
		t2.SuanArea();
		t2.show();
		
	}

}
