/**
 * 
 */
package structural.composite;

/**
 * @author nilesht
 *
 */
public class MenuItem extends MenuComponent {
	
	

	public MenuItem(String name, String url) {
		this.name = name;
		this.url = url;
	}

	/* (non-Javadoc)
	 * @see structural.composite.MenuComponent#toString()
	 */
	@Override
	public String toString() {
		return this.print();
	}

}
