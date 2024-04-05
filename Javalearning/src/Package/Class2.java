package Package;

public class Class2 extends Class1 {
	String s;
	public static void main(String[] args) {
		Class2 c2=new Class2();
		c2.a=10;
		c2.b=40.5;
		c2.s="Rudhu";
		System.out.println(c2.a);
		System.out.println(c2.b);
		System.out.println(c2.s);
		Class1 c1=new Class1();
		c1.a=30;
		c1.b=50.5;
		System.out.println(c1.a);
		System.out.println(c1.b);
		
		
	}
	

}
