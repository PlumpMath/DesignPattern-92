/**
 * 
 */
package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nilesht
 *
 */
public abstract class MenuComponent {
	
	String name;
	String url;
	List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}
	
	public abstract String toString();
	
	public String print(){
		StringBuilder builder = new StringBuilder();
		
		builder.append(name);
		builder.append(" :");
		builder.append(url);
		builder.append("\n");
		
		return builder.toString();
	}

}
