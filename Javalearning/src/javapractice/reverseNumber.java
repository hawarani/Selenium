package javapractice;

public class reverseNumber {
	public static void number(int num) {
		if(num==11) {
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
