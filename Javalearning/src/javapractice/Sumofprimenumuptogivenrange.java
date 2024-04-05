package javapractice;
import java.util.Scanner;
public class Sumofprimenumuptogivenrange {
	public static boolean isprime (int num) {
		if(num==0 || num==1 || num<0) {
			return false;
		}
		for (int i=2;i<=num/2;i++) {
		if(num%i==0) {
			return false;
		}
	
	}
	return true;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Range");
	int range=sc.nextInt();
	for(int i=1;i<=range;i++) {
		if(isprime(i)==true) {
			System.out.println(i);
		}	
	}
		
	}

}
