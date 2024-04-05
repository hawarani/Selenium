package Program;
import java.util.Scanner;
public class compositenumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		
		if(num==1||num==0||0>num) {
			System.out.println("neither a composte number nor a prime number");
		}
		else if(flag==true) {
			System.out.println("prime number");
			
		}
		else {
			System.out.println("composite number");
		}
		
	}
	

}
