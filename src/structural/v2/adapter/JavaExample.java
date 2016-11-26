/**
 * 
 */
package structural.adapter;

import java.util.Arrays;
import java.util.List;

/**
 * @author nilesht
 *
 */
public class JavaExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] intArray = new Integer[] {1,2,3};
		
		List<Integer> intList = Arrays.asList(intArray);
		
		System.out.println(intArray);
		
		System.out.println(intList);

	}

}
