/**
 * 
 */
package structural.flyweight;

/**
 * @author nilesht
 *
 */
public class Item {
	
	private final String itemName;
	
	public Item(String itemName) {
		this.itemName = itemName;
	}
	
	public String toString(){
		return itemName;
	}

}
