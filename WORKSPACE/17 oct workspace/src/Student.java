
public class Student {
int id;
double percentage;
String name;

void display()
{
	System.out.println("id is"+id);
	System.out.println("percentage is"+percentage);
	System.out.println("name is"+name);
}

public Student(int id, double percentage, String name) {
	this.id = id;
	this.percentage = percentage;
	this.name = name;
	System.out.println("hiii this is high prority constructor"+this.id);
}
public Student(byte id, float percentage, String name) {
	this.id = id;
	this.percentage = percentage;
	this.name = name;
	System.out.println(this.id);


}
}
