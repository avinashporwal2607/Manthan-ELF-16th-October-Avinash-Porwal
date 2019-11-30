import java.util.function.Supplier;

public class TestF {
	public static void main(String[] args) {
		Supplier<student> sup=()->new student(22, "dimple", 54);
		student s=sup.get();
		System.out.println("name is"+s.name);
		System.out.println("age is"+s.age);
		System.out.println("percent is"+s.percentage);
	}

}
