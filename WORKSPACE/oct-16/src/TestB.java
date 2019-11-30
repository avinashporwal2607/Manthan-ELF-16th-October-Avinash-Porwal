
public class TestB {
public static void main(String[] args) {
	Van v=new Van();
	v.cost=100;
	v.model="hyundai ";
	System.out.println(v.cost);
	System.out.println(v.model);
	v.move();
	v.stop();
}
}
