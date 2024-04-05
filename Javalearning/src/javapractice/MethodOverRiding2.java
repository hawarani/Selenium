package javapractice;

public class MethodOverRiding2 extends MethodOverRiding1  {
	public void method() {
		System.out.println("method 3");
	

	}
	public static void main(String[] args) {
		MethodOverRiding2 m2=new MethodOverRiding2();
		m2.method();
		MethodOverRiding1 m1=new MethodOverRiding1();
		m1.method();
		MethodOverRiding2 m2=m1;
		m2.method();
		
	}
}
