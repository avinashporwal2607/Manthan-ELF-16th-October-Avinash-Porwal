import java.util.function.Function;

public abstract class TestFunctional {
	public static void main(String[] args) {
		Function<String,Integer> fn=x->x.length();
		int ans=fn.apply("priya");
		System.out.println("length is"+ans);
		}

}
