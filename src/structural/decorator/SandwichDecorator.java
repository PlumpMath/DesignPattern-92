/**
 * 
 */
package structural.decorator;

/**
 * @author nilesht
 *
 */
public abstract class SandwichDecorator implements Sandwhich {

	Sandwhich sandwhich;
	
	public SandwichDecorator(Sandwhich sandwhich) {
		this.sandwhich = sandwhich;
	}
	
	/* (non-Javadoc)
	 * @see structural.decorator.Sandwhich#make()
	 */
	@Override
	public String make() {
		return sandwhich.make();
	}

}
