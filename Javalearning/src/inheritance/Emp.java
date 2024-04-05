package inheritance;

public class Emp {
String name;
 int age;
double salary;

public Emp(String s,int a,double d) {
	name=s;
	age=a;
	salary=d;
	System.out.println("Ename:"+name+" "+"Age:"+age+" "+"Salary:"+salary);
}
Public static void main(String[] args) {
	Emp e1=new Emp("Rudhvin",23,200000);
	Emp e2=new Emp("Shashu",20,670000);
	
	
	
	
	
}

}
