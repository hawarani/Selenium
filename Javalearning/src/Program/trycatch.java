package Program;

public class trycatch {
	public static void main(String[] args) {
		try {
		System.out.println('a');
		System.out.println('b');
		String s1="hello";
		System.out.println(s1.charAt(s1.length()));
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Exception handled 1");
	}
	catch(StringIndexOutOfBoundsException e) {
		System.out.println("Exception handled 2");
	}
	catch(Exception e) {
		System.out.println("Exception handled 3");
	
	}
	
	System.out.println("main");
		
	}

}
