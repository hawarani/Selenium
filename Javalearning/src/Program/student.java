package Program;

public class student {
	String name;
	int rollnum;
	int Class;
	double percentage;
	public student(String n,int r,int C,double p) {
		name=n;
		rollnum=r;
		Class=C;
		percentage=p;
		System.out.println("S.name:"+name+" "+"Rollnum:"+rollnum+" "+"Class:"+Class+" "+"Percentage:"+percentage);
	}
	public static void main(String[] args) {
		student s1=new student("rudhvin",1,4,97.8);
		student s2=new student("Shashu",3,1,98.6);

	}

}
