public class Consumer {
	
	public static void main(String[] args) {
		student st=new student(24, "rahul", 80);
		Consumer c=s->{
			System.out.println("name is"+s.name);
			System.out.println("age is"+s.age);
			System.out.println("percentage is"+s.percentage);
		};
		c.apply(st);
	}

}
