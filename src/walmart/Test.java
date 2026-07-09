package walmart;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		Employee e1=new Employee("dilip",25,10000);
		Employee e2=new Employee("nikki",21,10000);
		Employee e3=new Employee("addu",5,10000);
		
		List<Employee> empList= new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		empList.stream()
		.filter(e -> (e.getAge()>=25))
		.map(e -> e.getSalary()*10)
		.forEach(System.out::println);
		

	}

}
