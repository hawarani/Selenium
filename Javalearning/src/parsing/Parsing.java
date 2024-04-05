package parsing;

public class Parsing {
	public static void main(String[] args) {
		String s1="9feb2024";
		char[] arr=s1.toCharArray();
		int sum=0;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]>='0'&& arr[i]<='9'){
				sum=sum+Integer.parseInt(arr[i]+"");
				
		}
		
	}
System.out.println(sum);
}
}