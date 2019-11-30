
public class Testg {
	public static void main(String[] args) {
		Mouse m=new Touchpad();
		m.click();
		Keyboard k=new Touchpad();
		k.press();
		Touchpad t=new Touchpad();
		t.click();
		t.press();
	}

}
