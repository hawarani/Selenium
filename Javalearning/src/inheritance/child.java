package inheritance;

public class child extends parent {
	String s1="shashu";
	public static void main(String[] args) {
		child c1=new child();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.s1);
		c1.a=29;
		c1.b=45.4;
		c1.s1="vithu";
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.s1);
		parent p1=new parent();
		System.out.println(p1.a);
		System.out.println(p1.b);
		
		
		
		
		
		
	}

}
