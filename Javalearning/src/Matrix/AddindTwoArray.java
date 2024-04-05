package Matrix;
import java.util.*;

public class AddindTwoArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row and column for first Array");
		int row1=sc.nextInt();
		int col1=sc.nextInt();
		System.out.println("Enter row and column for second Array");
		int row2=sc.nextInt();
		int col2=sc.nextInt();
		if(row1!=row2 && col1!=col2){
			System.out.println("cannot be add");
			return;
		}else {
			int arr1[][]=new int [row1][col1];
			int arr2[][]=new int[row2][col2];
			int result[][]=new int[row1][col1];
			System.out.println("Enter the data for first array");
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr1[i].length;j++) {
					 arr1[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter the data for second array");
			for(int i=0;i<arr2.length;i++) {
				for(int j=0;j<arr2[i].length;j++) {
					 arr2[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<arr2.length;i++) {
				for(int j=0;j<arr2[i].length;j++) {
					 result[i][j]=arr1[i][j]+arr2[i][j];
				}
			}
			
		System.out.println("Answer is");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(result[i][j]+" ");
			

		}
		
		System.out.println();
	}

}
	}
}
