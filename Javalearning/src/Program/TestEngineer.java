package Program;

public class TestEngineer extends Emp {
	public static void main(String[] args) {
		TestEngineer t1=new TestEngineer();
		t1.ename="kaif";
		t1.eid=1;
		t1.salary=30000;
		System.out.println("Ename:"+t1.ename);
		System.out.println("Eid:"+t1.eid);
		System.out.println("salary:"+t1.salary);
		Emp e1=new Emp();
		e1.ename="sachin";
		e1.eid=2;
		e1.salary=30000;
		System.out.println("Ename:"+e1.ename);
		System.out.println("Eid:"+e1.eid);
		System.out.println("salary:"+e1.salary);
		
		
		
		
	}

}
