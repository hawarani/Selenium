package javapractice;

public class PrintingNumber {
	public static void number(int num) {
		if(num==7) {
			return;
		}
		number(num+1);
		System.out.println(num);
		return;
	}
	public static void main(String[] args) {
		number(1);
	}

}
