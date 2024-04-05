package Program;
import java.util.Scanner;
public class Armstrongnumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num;
		int count=0;
		while(temp!=0) {
			count++;
			temp=temp/10;
		}
		temp=num;
		int arm=0;
		while(temp!=0) {
			int rem=temp%10;
			int prod=1;
			for(int i=1;i<=count;i++) {
				prod=prod*rem;
			}
			arm=arm+prod;
			temp=temp/10;
		}
		if(arm==num) {
			System.out.println("armstrongnumber");
		}
		else}{
			System.out.println(" not armstrongnumber");
		}
		
			
			}
		}
	}


