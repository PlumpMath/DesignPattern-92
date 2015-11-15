/**
 * 
 */
package structural.adapter;

/**
 * @author nilesht
 *
 */
public class EmployeeLdapAdapter implements Employee {
	
	private EmployeeLdap instance;
	
	

	public EmployeeLdapAdapter(EmployeeLdap instance) {
		super();
		this.instance = instance;
	}

	/* (non-Javadoc)
	 * @see structural.adapter.Employee#getId()
	 */
	@Override
	public String getId() {
		return instance.getCp();
	}

	/* (non-Javadoc)
	 * @see structural.adapter.Employee#getName()
	 */
	@Override
	public String getName() {
		return instance.getGivenName();
	}

	/* (non-Javadoc)
	 * @see structural.adapter.Employee#getEmail()
	 */
	@Override
	public String getEmail() {
		return instance.getMail();
	}

}
