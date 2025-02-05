package com.aurionpro.composite.model;

import java.util.ArrayList;
import java.util.List;

public class Composite implements IComponent {
	
	String name;
	List<IComponent> componentList = new ArrayList<IComponent>();
	
	
	public Composite(String name) {
		super();
		this.name = name;
	}

	public void addComponent(IComponent component) {
		componentList.add(component);
	}

	@Override
	public double getPrice() {
		return componentList.stream().map(component -> component.getPrice()).reduce(0.0, (price1,price2) -> price1+ price2);
	}
	
}
