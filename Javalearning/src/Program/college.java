package Program;

public class college {
	String studentname;
	int semester;
	double cgpa;
	int No_of_backlog;
	public college(String studentname,int semester,double cgpa,int No_of_backlog) {
		this.studentname=studentname;
		this.semester=semester;
		this.cgpa=cgpa;
		this.No_of_backlog=No_of_backlog;
	
	System.out.println("Student name:"+this.studentname+" "+"Semester:"+this.semester+" "+"cgpa:"+this.cgpa+" "+"No of backlog:"+this.No_of_backlog);
	}
	public static void main(String[] args) {
	college c1=new college("Rani",4,56.7,1);
	college c2=new college("Arun",6,87.5,2);
	
	
}
}

