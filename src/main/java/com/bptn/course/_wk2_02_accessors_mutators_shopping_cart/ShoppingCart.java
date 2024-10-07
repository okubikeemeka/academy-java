package com.bptn.course._wk2_02_accessors_mutators_shopping_cart;

class ShoppingCart {

		private  CartItem[] items; //0,1,2,3,4,
		private int itemCount;
		
		public ShoppingCart() {
			items = new CartItem[5];
			itemCount = 0;
		}
		
		//addProductToCart
		public void addProductToCart(Product product, int quantity) {
		if (itemCount <=4) {	
		CartItem newItems = new CartItem (product, quantity);
		items [itemCount] = newItems;
		itemCount++;
		product.reducesStock(quantity);
	} else {
		throw new IllegalArgumentException("Cart full!");
	}
		}
		
		//	showProductsInCart
		public CartItem[] showProductsInCart() {
			CartItem[] currentItems = new CartItem[itemCount];
			// loop through the array to get the item data
			for(int i=0; i<itemCount; i++) {
				currentItems[i] = items[i];
			}
			return currentItems;
		}
		

	}
	
	
	
	
	
	
	
	
	
	

