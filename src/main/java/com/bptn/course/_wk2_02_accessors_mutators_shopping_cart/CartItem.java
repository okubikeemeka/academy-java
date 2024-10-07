package com.bptn.course._wk2_02_accessors_mutators_shopping_cart;

class CartItem {

	private  Product product;
	private int cartQuantity;
	
	public CartItem (Product product, int quantity) {
	this.product = product;
	this.cartQuantity = quantity;
	
		if(cartQuantity > product.getProductQuantity()) {
			
			throw new IllegalArgumentException("Insuficient Stock");
		} 
		this.product = product;
		this.cartQuantity = quantity;
	}
		//Getters
		public Product getProduct() {
			return this.product;
			}
			
			public int getCartQuantity() {
			return this.cartQuantity;
			}
			
			public double getTotalPrice() {
				return product.getProductPrice() * this.cartQuantity;
			}
			
	}
			
			
			
			
			
		
		
		
		
		

