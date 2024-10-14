import java.util.HashMap;

import com.bptn.course._wk3_05_big_coding_friday.OutOfStockException;

//public class Store {

	// create the map instance variable
	private HashMap<String, Integer> products = new HashMap<>();

	//public Store() {
		// Initialize the products map with default values

		products.put("apple", 10);
		products.put("banana", 5);
		products.put("orange", 0);
	}

	public void purchase(String product, int quantity) throws OutOfStockException {
		// Check if the product is available in the store. Hint: Use the map
		if (products.containsKey(product)) {
			System.out.println("Product " + product + " available in store");
			// If not, throw an OutOfStockException with a message indicating the product is
			// not available.
		} else {
			throw new OutOfStockException("Product " + product + " not available in store");
		}
		// Check if there is enough stock for the desired quantity. Hint: Use the map
		if (products.get(product) > 0 && products.get(product) >= quantity) {
			System.out.println("Product " + product + " in stock.");

			// If not, throw an OutOfStockException with a message indicating the product is
			// out of stock.
		} else {
			throw new OutOfStockException("Product " + product + " out of stock.");
		}
	}
}
public class Dontuse {

}
