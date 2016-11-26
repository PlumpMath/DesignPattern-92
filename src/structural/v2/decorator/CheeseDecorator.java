/**
 * 
 */
package structural.decorator;

/**
 * @author nilesht
 *
 */
public class CheeseDecorator extends SandwichDecorator {

	public CheeseDecorator(Sandwhich sandwhich) {
		super(sandwhich);
	}
	
	public String make(){
		return sandwhich.make() + addCheese();
	}

	private String addCheese() {
		return " + cheese";
	}

}
