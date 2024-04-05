package Assignment;

public class Swaptwostrings {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="All";
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.print(s1+" ");
		System.out.print(s2+" ");

	}

}
