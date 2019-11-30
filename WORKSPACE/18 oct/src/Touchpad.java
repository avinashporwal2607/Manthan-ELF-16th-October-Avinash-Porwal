
public class Touchpad implements Mouse, Keyboard {

	@Override
	public void press() {
		System.out.println("Press method");

	}

	@Override
	public void click() {
		System.out.println("click method");
	}

}
