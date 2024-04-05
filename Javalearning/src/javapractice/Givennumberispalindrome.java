package javapractice;
import java.util.Scanner;
public class  Givennumberispalindrome {
	public static boolean ispallindrome(int num) {
	int temp=num;
	int rev=0;
	while(temp!=0) {
		int rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
	if(num==rev) {
		return true;
	}else {
	return false;
}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Range");
	int range=sc.nextInt();
	for(int i=1;i<=range;i++) {
		if(ispallindrome(i)==true) {
			System.out.println(i);
		}
	}
}
}
