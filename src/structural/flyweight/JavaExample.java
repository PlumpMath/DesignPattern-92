/**
 * 
 */
package structural.flyweight;

/**
 * @author nilesht
 *
 */
public class JavaExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer intOne = Integer.valueOf(1);
		Integer intTwo = Integer.valueOf(1);
		Integer intThree = Integer.valueOf(2);
		
		String strOne = "Nilesh";
		String strTwo = "Nilesh";
		String strThree = "Shraddha";
		
		System.out.println(System.identityHashCode(intOne));
		System.out.println(System.identityHashCode(intTwo));
		System.out.println(System.identityHashCode(intThree));
		
		System.out.println(System.identityHashCode(strOne));
		System.out.println(System.identityHashCode(strTwo));
		System.out.println(System.identityHashCode(strThree));
	}

}
