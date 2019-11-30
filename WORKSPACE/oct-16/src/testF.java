
public class testF {
	public static void main(String[] args) {
		Demo d=new Demo();
		d.i=10;
		System.out.println(d.i);
		d.eat();
		Demo.j=20;
	System.out.println(Demo.j);
	Demo.run();
}
}
