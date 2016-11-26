/**
 * 
 */
package structural.adapter;

import java.util.List;

/**
 * @author nilesht
 *
 */
public class OurExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EmployeeClient client = new EmployeeClient();
		
		List<Employee> empList = client.getEmployee();
		
		System.out.println(empList);

	}

}
