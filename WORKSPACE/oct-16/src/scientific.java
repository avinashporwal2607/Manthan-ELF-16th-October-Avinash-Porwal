//import java.lang.reflect.Method;

public class scientific extends calculator
{
	public static void main(String[] args) {
		scientific s=new scientific();
		s.cost=500;
		s.add();
		s.mul();
		System.out.println("the calculator cost is "+s.cost);
		s.sin();
		s.cos();

	}
	void sin()
	{
		System.out.println("i am sin method");
	}
	void cos()
	{
		System.out.println("i am cos method");
	}

}
