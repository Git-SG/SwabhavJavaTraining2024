package com.aurionpro.adapter.model;

import java.util.List;

public class ShoppingCart {
	
	private List<IItem> cartItems;

	public ShoppingCart(List<IItem> cartItems) {
		this.cartItems = cartItems;
	}
	
	public void addItemtoCart(IItem item) {
		cartItems.add(item);
	}
	
	public List<IItem> getCartItems(){
		return cartItems;
	}
	
	public double getCartPrice() {
		return cartItems.stream().map(item -> item.getItemPrice()).reduce(0.0, (price1,price2) -> price1+ price2);
	}

}
