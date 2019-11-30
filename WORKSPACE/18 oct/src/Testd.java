
public class Testd {
public static void main(String[] args) {
	Animal a=new Cow();
	a.drink();
	a.eat();
	Animal a1 =new Lion();//here you can not use same reference variable like as a//
	a1.drink();
	a1.eat();
}
}
