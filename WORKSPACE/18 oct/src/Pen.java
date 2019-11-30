
public abstract class  Pen {
 int cost;
 void write()
 {
 System.out.println("i am write method");
 }
 void color()
 {
	  System.out.println("i am color method");
 }
 abstract void open();
 abstract void close();
 
}
