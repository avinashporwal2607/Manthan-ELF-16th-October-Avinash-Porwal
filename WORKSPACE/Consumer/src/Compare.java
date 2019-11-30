import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Compare {
	public static void main(String[] args) {
		List<Integer>al=new ArrayList<Integer>();
		al.add(30);
		al.add(58);
		al.add(10);
		al.add(2);
		al.add(7);
		al.add(5);
		Comparator<Integer> C=(i,j)->i.compareTo(j);
		 Integer bl=al.stream().max(C).get();//return maxium number
		 System.out.println(bl);
		 Integer bl1=al.stream().min(C).get();//return minimum number
		 System.out.println(bl1);
		 
	}

}
