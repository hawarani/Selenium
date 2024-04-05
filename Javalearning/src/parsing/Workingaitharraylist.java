package parsing;
import java.util.ArrayList;
public class Workingaitharraylist {
	public static void main(String[] args) {
		ArrayList d1=new ArrayList();
		d1.add(34);
		d1.add(76);
		d1.add(54);
		d1.add(43);
		System.out.println(d1);
		ArrayList d2=new ArrayList();
		d2.add(72);
		d2.add(71);
		d2.add(90);
		d2.add(63);
		d2.addAll(d1);
		System.out.println(d2);
		System.out.println(d2.size());
		System.out.println(d2.containsAll(d1));
		System.out.println(d1.containsAll(d2));
	}

}
