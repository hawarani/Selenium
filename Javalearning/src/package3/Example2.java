package package3;

public class Example2 {


		public static void main(String[] args) {
			try {
				System.out.println('A');
				System.out.println('B');
				String s1="Hello";
				System.out.println(s1.charAt(s1.length()));
				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("exception handled 1");
				
			}catch(StringIndexOutOfBoundsException e) {
				
				System.out.println("Exception handled 2");
				
			}catch(Exception e) {
				System.out.println("exception handled 3");
			}
			System.out.println("this is main method");
		}
	}




