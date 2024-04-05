package array;
import java.util. Scanner;
public class Student {
	
		String sname;
		String Address;
		int rollNo;
		int Class;
		double percentage;
		public Student(String sname,String Address, int rollNo, int Class,double percentage) {
			
			this.sname = sname;
			this.Address=Address;
			this.rollNo = rollNo;
			this.Class = Class;
			this.percentage=percentage;
		}
		public String toString() {
			return "Student name:"+this.sname+" "+"Address:"+this.Address+" "+"Roll Number:"+this.rollNo+" "+"Class:"+this.Class+" "+"Percentage:"+this.percentage;
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size");
			int size=sc.nextInt();
			Student arr[]=new Student[size];
			System.out.println("Enter the details");
			for(int i=0;i<arr.length;i++) {
				sc.nextLine();
				System.out.println("Enter the student name");
				String sname=sc.nextLine();
				System.out.println("Enter the address");

				String Address=sc.nextLine();
				System.out.println("Enter the rollNo");
				int rollNo=sc.nextInt();
				System.out.println("Enter the Class");
				int Class=sc.nextInt();
				System.out.println("Enter the percentage");
				double percenatge=sc.nextDouble();
				arr[i]=new Student(sname,Address, rollNo,Class,percenatge);
				
			}
			System.out.println("the details are:");
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
			
		}

		}




