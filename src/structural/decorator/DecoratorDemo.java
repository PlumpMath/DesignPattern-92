/**
 * 
 */
package structural.decorator;

/**
 * @author nilesht
 *
 */
public class DecoratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sandwhich sandwhich = new VegDecorator(new CheeseDecorator(new SimpleSandwich()));
		
		System.out.println(sandwhich.make());

	}

}
