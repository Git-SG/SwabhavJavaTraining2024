package com.aurionpro.adapter.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.adapter.model.Biscuit;
import com.aurionpro.adapter.model.Hat;
import com.aurionpro.adapter.model.HatAdapter;
import com.aurionpro.adapter.model.IItem;
import com.aurionpro.adapter.model.ShoppingCart;

public class CartTest {
	public static void main(String[] args) {
		List<IItem> cartItems = new ArrayList();
		
		ShoppingCart cart = new ShoppingCart(cartItems);
		
		cart.addItemtoCart(new Biscuit("Parle G", 10.0));
		cart.addItemtoCart(new Biscuit("Oreo", 20.0));
		cart.addItemtoCart(new HatAdapter(new Hat("Short", "long", 100, 20)));
		cart.addItemtoCart(new HatAdapter(new Hat("Short1", "long1", 200, 40)));
		
		List<IItem> cartItemsList = cart.getCartItems();
		
		System.out.println(cartItemsList);
		
		System.out.println("Total cart price is " + cart.getCartPrice());

	}

}
