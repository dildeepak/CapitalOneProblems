package capitalOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee{
	String name;
	String dept;
	
	Employee(String name,String dept){
		this.name=name;
		this.dept=dept;
		}
	
	@Override
	public String toString() {
		return name;
	}
}
public class GroupByDepartment {

	public static void main(String[] args) {
		
		List<Employee> employees= Arrays.asList(
				new Employee("Dilip", "Capital One"),
				new Employee("Sumit", "CVS"),
				new Employee("Nikki", "Capital One"));
		
		Map<String , List<Employee>> companyMap=new HashMap<>();
		
		for(Employee employee:employees) {
			companyMap.computeIfAbsent(employee.dept, key -> new ArrayList<>())
			.add(employee);
		}
		System.out.println(companyMap);
		
	}

}
