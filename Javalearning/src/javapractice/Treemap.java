package javapractice;

public class Treemap {

		public static void main(String[] args) {
			Treemap t=new Treemap<>();
		    t.put(1,"raji");
		    t.put(2,"raja");
		    t.put(3,"rani");
			  Iterator i=t.descendingIterator();
		    while(i.hasNext()) {
		    	System.out.println(i.next());
		    }
		    
		}
	}


}
