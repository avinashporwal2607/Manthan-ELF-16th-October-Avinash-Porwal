import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import javax.crypto.AEADBadTagException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest1 {
     private Calculator c;
     @BeforeEach
     public void createObject()
     {
    	 c=new Calculator();
     }
     @Test
     public void Testadd()
     {
    	 int res =c.add(10, 20);
    	 assertEquals(30,res);
     }
     @Test
     public void TestDiv()
     {
    	 int res =c.div(10, 5);
    	 assertEquals(2,res);
     }
     @Test//you can disable this case by @disabled
     public void divForException()
     {
    	 assertThrows(ArithmeticException.class, ()->c.div(10,0));//here u have to give exception type input
     }
}
