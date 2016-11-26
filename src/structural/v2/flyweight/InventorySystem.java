/**
 * 
 */
package structural.flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author nilesht
 *
 */
public class InventorySystem {
	
	private final Catalog catalog = new Catalog();
	private final List<Order> orders = new CopyOnWriteArrayList<Order>();
	
	public void takeOrder(String itemName, int orderNum){
		Item item = catalog.lookup(itemName);
		Order order = new Order(item, orderNum);
		orders.add(order);
	}
	
	public void process(){
		for (Order order: orders) {
			order.processOrder();
			orders.remove(order);
		}
	}
	
	public String report() {
		return "\nTotal items created are " + catalog.totalItemsMade();
	}

}
