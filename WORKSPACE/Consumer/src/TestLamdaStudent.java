import java.util.function.Function;

public class TestLamdaStudent {
	public static void main(String[] args) {
		student st=new student(24, "rahul", 80);
		System.out.println("before lamda"+st.percentage);
		//<input type , return type>
		Function<student, student> fs=
				s->{
			s.percentage=s.percentage+4;
			return s;
		};
		student t=fs.apply(st);
		System.out.println("After lamda"+t.percentage);
	}

}
