
	package array;
	import java.util. Scanner;
	public class college {
		
			String sname;
			int regNo;
			int semester;
			int No_of_backlog;
			public college(String sname,int regNo, int semester, int No_of_backlog) {
				
			this.sname = sname;a
				this.regNo = regNo;
				this.semester = semester;
				this.No_of_backlog=No_of_backlog;
			}
			public String toString() {
				return "Student name:"+this.sname+" "+"RegNo:"+this.regNo+" "+"Semester:"+this.semester+" "+"No_of_backlog:"+this.No_of_backlog;
			}
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the size");
				int size=sc.nextInt();
				college arr[]=new college[size];
				System.out.println("Enter the details");
				for(int i=0;i<arr.length;i++) {
					sc.nextLine();
					System.out.println("Enter the student name");
					String sname=sc.nextLine();
					System.out.println("Enter the RegNo");
					int regNo=sc.nextInt();
					System.out.println("Enter the semester");
					int semester=sc.nextInt();
					System.out.println("Enter the No_of_backlog");
					int No_of_backlog=sc.nextInt();
					arr[i]=new college(sname,regNo,semester,No_of_backlog);
					
				}
				System.out.println("the details are:");
				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i]);
				}
				
			}

			}







