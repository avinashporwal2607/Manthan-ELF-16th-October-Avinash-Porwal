
public class TEST {
	public static void main(String[] args) {
		ThirdGen t=new ThirdGen();
		System.out.println("******WELCOME TO THIRD GENERATION MOBILE ******");
		t.call();
		t.msg();
		t.radio();
		t.camera();
		SecondGen s=new SecondGen();
		System.out.println("******WELCOME TO second GENERATION MOBILE ******");
		s.call();
		s.msg();
		s.radio();
		FirstGen f=new FirstGen();
		System.out.println("******WELCOME TO first GENERATION MOBILE ******");
		f.call();
		f.msg();
	}
}
