import java.util.*;   
class Employee3 {
	
	public int id;
	public String name;
	public int age;
	
	public Employee3(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		// TODO Auto-generated constructor stub
	}
}
class AgeComparator implements Comparator<Employee3>{

	@Override
	public int compare(Employee3 o1, Employee3 o2) {
		// TODO Auto-generated method stub
		return o1.age - o2.age;
	}
	
}

class nameComparator implements Comparator<Employee3>{

	@Override
	public int compare(Employee3 o1, Employee3 o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}
public class EmployeeComparator {
	public static void main(String[] args) {
		List<Employee3> list = new ArrayList<>();
		list.add(new Employee3(1, "Adiya", 34));
		list.add(new Employee3(2, "Muskan", 23));
		list.add(new Employee3(3, "Akansha", 42));
		list.add(new Employee3(4, "Aditi", 29));
		list.add(new Employee3(5, "Nimish", 31));
		System.out.println("Sorted by Age :");
		Collections.sort(list, new AgeComparator());
		for(Employee3 e : list) {
			System.out.println("Employee id:" + e.id +" Employee Name:"+e.name+" Employee age:"+e.age);
		}
		System.out.println("------------------");
		System.out.println("Sorted by Name :");
		Collections.sort(list, new nameComparator());
		for(Employee3 e : list) {
			System.out.println("Employee id:" + e.id +" Employee Name:"+e.name+" Employee age:"+e.age);
		}
	}

}
