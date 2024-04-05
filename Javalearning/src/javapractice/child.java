package javapractice;

public class child extends parent {
	int c;
	double d;
	public static void main(String[] args) {
		child c1=new child();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
		System.out.println(c1.d);
		parent p1=new parent();
		System.out.println(p1.a);
		System.out.println(p1.b);
		//System.out.println(p1.c);
		//System.out.println(p1.d);
		p1=c1;
		System.out.println(p1);
		System.out.println(c1);
		System.out.println(p1 instanceof child);
		c1= (child)p1;
		System.out.println(p1);
		System.out.println(c1);
		System.out.println(c1 instanceof parent);
		
		
		
	}
	

}
