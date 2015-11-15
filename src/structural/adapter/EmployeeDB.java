/**
 * 
 */
package structural.adapter;

/**
 * @author nilesht
 *
 */
public class EmployeeDB implements Employee {

	private String id;
	private String name;
	private String email;
	
	public EmployeeDB(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	/* (non-Javadoc)
	 * @see structural.adapter.Employee#getId()
	 */
	@Override
	public String getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see structural.adapter.Employee#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see structural.adapter.Employee#getEmail()
	 */
	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "EmployeeDB [id=" + id + ", name=" + name + ", email=" + email
				+ "]";
	}
	
	

}
