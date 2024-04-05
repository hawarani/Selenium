package package3;

public class Example {


		public static void main(String [] args){

		try{
		int arr[]={1,2,3,4,5};
		System.out.println(arr[arr.length]);

		}catch(Exception e){

			System.out.println("Exception 1");     //error

		}catch(ArrayIndexOutOfBoundException e){

			System.out.println("Exception 2");
		}
		catch(StringIndexOutOfBoundException e){
			System.out.println("Exception 2");
		}
		}



}
