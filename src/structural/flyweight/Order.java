/**
 * 
 */
package structural.flyweight;

/**
 * @author nilesht
 *
 */
public class Order {
	
	private final Item item;
	private final int orderNum;
	
	public Order(Item item, int orderNum) {
		super();
		this.item = item;
		this.orderNum = orderNum;
	}
	
	public void processOrder(){
		System.out.println("Ordering "+ item + " for order number " + orderNum);
	}

}
