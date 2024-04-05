package javapractice;

public class PrintingtheName {
	public static void Name(int num) {
	
	if(num==0) {
		return;
	}
	Name(num-1);
	System.out.println("Rudhvin");

	return;
	}
	public static void main(String[] args) {
		
	Name(5);	

}
}