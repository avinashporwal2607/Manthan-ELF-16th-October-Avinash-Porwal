import java.util.function.Predicate;

public class TestPredicate {
	public static void main(String[] args) {
		student st=new student(22,"divya",22);
		
		Predicate<student> ps=s->{
			if(s.percentage>=35)
			{
				return true;
			}else
			{
				return false;
			}
		};
boolean ans=ps.test(st);
System.out.println("result is"+ans);
	}
	
}


