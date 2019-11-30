import java.util.ArrayList;
import java.util.function.Predicate;

public class TestG {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(30);
		al.add(58);
		al.add(10);
		al.add(2);
		al.add(7);
		al.add(5);

		Predicate<Integer> p=i->i%2 !=0; 
			boolean b=p.test(7);
			System.out.println(b);

		};
	}

