
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;  
class Employee2 implements Comparable<Employee2>{
	
	public int id;
	public String name;
	public int age;
	
public Employee2(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int compareTo(Employee2 o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	
}
public class comparableName {
	public static void main(String[] args) {
		List<Employee2> list = new ArrayList<>();
		list.add(new Employee2(1, "Adiya", 34));
		list.add(new Employee2(2, "Muskan", 23));
		list.add(new Employee2(3, "Akansha", 42));
		list.add(new Employee2(4, "Aditi", 29));
		list.add(new Employee2(5, "Nimish", 31));
		
		Collections.sort(list);
		for(Employee2 e : list) {
			System.out.println("Sorted by Name :");
			System.out.println("Employee id:" + e.id +" Employee Name:"+e.name+" Employee age:"+e.age);
		}
	}
}
