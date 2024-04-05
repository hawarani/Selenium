package Program;
import java.util.*;
public class sumofthenumber {
public static void sum_of_num(int num) {
	if(num==0) {
		return ;
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum=sum+num;
		}
			
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int result=sum_of_num(sum);
		System.out.println("reult");
		
		
	}
}

