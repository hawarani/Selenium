package javapractice;

public class MyFirst {
	int a;
	public MyFirst() {
		System.out.println("F C");
	}
	{
		System.out.println("iib1");	
	}
	{
		System.out.println("this.a");
		System.out.println("iib2");
	}
	MyFirst(int a){
		this.a=a;
		System.out.println("a");
	}
	public static void main(String[] args) {
		MyFirst m=new MyFirst();
		MyFirst m1=new MyFirst(10);
	}
}
