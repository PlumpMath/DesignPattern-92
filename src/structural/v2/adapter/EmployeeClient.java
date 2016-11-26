/**
 * 
 */
package structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nilesht
 *
 */
public class EmployeeClient {

	public List<Employee> getEmployee() {
		List<Employee> empList = new ArrayList<Employee>();
		
		Employee empDB = new EmployeeDB("123", "Ram", "ram@india.com");
		
		empList.add(empDB);
		
		EmployeeLdap empLdap = new EmployeeLdap("432", "Ganesh", "ganesh@india.com");
		
		empList.add(new EmployeeLdapAdapter(empLdap));
		
		return empList;
	}

}
