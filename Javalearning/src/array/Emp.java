package array;

import java.util.Scanner;


public class Emp {
	String ename;
	int eid;
	double salary;
	public Emp(String ename,int eid,double salary) {
		super();
		this.ename=ename;
		this.eid=eid;
		this.salary=salary;
	}
	public String toString() {
		return"Ename:"+this.ename+" "+"Eid:"+this.eid+" "+"salary:"+this.salary;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		Emp arr[]=new Emp[size];
		System.out.println("Enter the details");
		for(int i=0;i<=arr.length;i++) {
			sc.nextLine();
			System.out.println("Enter the name");
			String ename=sc.nextLine();
			System.out.println("Enter the id");
			int eid=sc.nextInt();
			System.out.println("Enter the salary");
			double salary=sc.nextDouble();
			arr[i]=new Emp(ename,eid,salary);
		}
		System.out.println("the details are:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
	
			
		
		
		