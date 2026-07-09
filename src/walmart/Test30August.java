package walmart;

import java.util.Arrays;
import java.util.List;

/**
 * //You have a list of `Employee` objects, each with a `name`, `age`, and `department`. 
//Write a Java code snippet using the Stream API to find the average age of employees in the "Engineering" department who are older than 30. 
//Additionally, handle the case where there might be no employees meeting these criteria by returning 0.
       List<Employee> employees = Arrays.asList(
           new Employee("Alice", 35, "Engineering"),
           new Employee("Bob", 40, "Engineering"),
           new Employee("Charlie", 28, "Engineering"),
           new Employee("David", 45, "HR"),
           new Employee("Eve", 50, "Engineering")
       );
 * @author dilde
 *
 */
public class Test30August {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Emp> employees = Arrays.asList(
		           new Emp("Alice", 35, "Engineering"),
		           new Emp("Bob", 40, "Engineering"),
		           new Emp("Charlie", 28, "Engineering"),
		           new Emp("David", 45, "HR"),
		           new Emp("Eve", 50, "Engineering")
		       );
		
		employees.stream()
		.filter(e -> e.getDept().equals("Engineering") && e.getAge() > 30) // filtering based on "Engineering
		.mapToInt(Emp::getAge).average().orElse(0);
		

	}

}
