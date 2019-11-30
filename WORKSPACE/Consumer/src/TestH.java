import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestH {
	public static void main(String[] args) {
		List<Integer>al=new ArrayList<Integer>();
		al.add(30);
		al.add(58);
		al.add(10);
		al.add(2);
		al.add(7);
		al.add(5);
		
	
		Predicate<Integer> p=i->i%2 !=0;//filter odd data logic
		List<Integer> bl=al.stream().filter(p).collect(Collectors.toList());//it is filtering only odd data here
		
	System.out.println(bl);
					
	}

}
