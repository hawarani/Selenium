package Matrix;

public class Duplicateword {
	

		public static void main(String[] args) {
			String data="Hello Hye Hello How are how You";
			String arr[]=data.split(" ");
		
			TreeMap<String,Integer> value=new TreeMap<>();
			for(int i=0;i<arr.length;i++) {
				int count=0;
				for(int j=0;j<arr.length;j++) {
					
					if(arr[i].equals(arr[j])) {
						count++;
					}
				}
				value.put(arr[i],count);
			}
			System.out.println(value);
		}
	}

}
