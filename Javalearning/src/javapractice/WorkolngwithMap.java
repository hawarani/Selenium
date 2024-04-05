package javapractice;
import java.util.*;
public class WorkolngwithMap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				
	HashMap<Character,Integer>data=new HashMap<>();
	System.out.println("Enter the String");
	String s1=sc.nextLine();
	s1=s1.replace(" ","");
	char arr[]=s1.toCharArray();
	for(int i=0;i<arr.length;i++) {
		int count=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
			}
		}
		data.put(arr[i], count);
		
		}
	System.out.println(data);
	}

}
