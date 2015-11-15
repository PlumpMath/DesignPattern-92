/**
 * 
 */
package structural.adapter;

/**
 * @author nilesht
 *
 */
public class EmployeeLdap {
	
	private String cp;
	private String givenName;
	private String mail;
	
	
	public EmployeeLdap(String cp, String givenName, String mail) {
		super();
		this.cp = cp;
		this.givenName = givenName;
		this.mail = mail;
	}
	
	public String getCp() {
		return cp;
	}
	public String getGivenName() {
		return givenName;
	}
	public String getMail() {
		return mail;
	}
	
	

}
