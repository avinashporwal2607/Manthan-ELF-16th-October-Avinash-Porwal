
public class execute {
public static void main(String[] args) {
	Qspider i=new Qspider();
	Qspider j=new Qspider();
	Qspider k=new Qspider();
	i.swipe();
	j.swipe();
	k.swipe();
	i.swipe();
	i.swipe();
	System.out.println(i.count);
	System.out.println(j.count);
	System.out.println(k.count);
	System.out.println(i.count);
	System.out.println(i.count);
	System.out.println("the organization count is"+Qspider.orgcount);
	
}
}
