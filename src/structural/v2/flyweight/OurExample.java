/**
 * 
 */
package structural.flyweight;

/**
 * @author nilesht
 *
 */
public class OurExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InventorySystem is = new InventorySystem();
		
		is.takeOrder("Infant diaper", 1);
		is.takeOrder("Small diaper", 2);
		is.takeOrder("Medium diaper", 3);
		is.takeOrder("Infant diaper", 1);
		is.takeOrder("Medium diaper", 3);
		is.takeOrder("Medium diaper", 3);
		is.takeOrder("Small diaper", 2);
		is.takeOrder("Small diaper", 2);
		is.takeOrder("Medium diaper", 3);
		is.takeOrder("Infant diaper", 1);
		is.takeOrder("Small diaper", 2);
		is.takeOrder("Medium diaper", 3);
		is.takeOrder("Small diaper", 2);
		is.takeOrder("Infant diaper", 1);
		is.takeOrder("Infant diaper", 1);
		is.takeOrder("Medium diaper", 3);
		is.takeOrder("Small diaper", 2);
		is.takeOrder("Small diaper", 2);
		is.takeOrder("Medium diaper", 3);
		is.takeOrder("Medium diaper", 3);
		is.takeOrder("Medium diaper", 3);
		is.takeOrder("Small diaper", 2);
		is.takeOrder("Infant diaper", 1);
		is.takeOrder("Small diaper", 2);
		
		is.process();
		
		System.out.println(is.report());
		is.takeOrder("Infant diaper", 1);
		is.takeOrder("Infant diaper", 1);
	}

}
