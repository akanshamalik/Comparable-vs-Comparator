import java.util.*;  
class Employee implements Comparable<Employee>{
	
	public int id;
	public String name;
	public int age;
	
public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return age - o.age;
	}
	
}
public class comparableAge {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "AB", 34));
		list.add(new Employee(2, "BB", 23));
		list.add(new Employee(3, "CB", 42));
		list.add(new Employee(4, "DB", 29));
		list.add(new Employee(5, "EB", 31));
		
		Collections.sort(list);
		for(Employee e : list) {
			System.out.println("Sorted by age :");
			System.out.println("Employee id:" + e.id +" Employee Name:"+e.name+" Employee age:"+e.age);
		}
	}
}
