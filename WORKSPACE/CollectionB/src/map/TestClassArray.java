package map;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;




public class TestClassArray {
	public static void main(String[] args) {
		TreeMap<String, ArrayList<Student>> t=new TreeMap<String,ArrayList<Student>>();
		ArrayList<Student> al1=new ArrayList<Student>();
		Student s=new Student("AVINASH", 1, 9.8);
		Student s1=new Student("DIVYA", 2, 9.2);
		Student s2=new Student("DIMPLE", 8, 7.8);
		Student s3=new Student("SIMRAN", 10, 6.7);
		al1.add(s);
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
	//System.out.println(t.al1);
		
		ArrayList<Student> al2=new ArrayList<Student>();
		Student s4=new Student("AVINASH", 1, 9.8);
		Student s5=new Student("DIVYA", 2, 9.2);
		Student s6=new Student("DIMPLE", 8, 7.8);
		al2.add(s4);
		al2.add(s5);
		al2.add(s6);
	
		t.put("AVI",al1);
		t.put("gm",al2);
		
		Set<Map.Entry<String, ArrayList<Student>>> se=t.entrySet();
		for(Entry<String, ArrayList<Student>> m:se)
		{
			System.out.println(m.getKey());
			ArrayList<Student> a =m.getValue();
			for(Student ss:a) {
				System.out.println(ss.id);
				System.out.println(ss.name);
				System.out.println(ss.percent);
				System.out.println("------------new one------------");
			}
		
		}
		
		
		
	}

}
