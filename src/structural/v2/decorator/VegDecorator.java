/**
 * 
 */
package structural.decorator;

/**
 * @author nilesht
 *
 */
public class VegDecorator extends SandwichDecorator {

	public VegDecorator(Sandwhich sandwhich) {
		super(sandwhich);
	}

	@Override
	public String make() {
		return sandwhich.make() + addVeg();
	}

	private String addVeg() {
		return " + veg";
	}
	
}
