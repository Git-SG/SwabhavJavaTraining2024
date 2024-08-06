package com.aurionpro.model;

public class BoxConstructorChaining {
	private int width;
	private int length;
	private int depth;
	
	public BoxConstructorChaining() {
	}
	
	public BoxConstructorChaining(int width, int length) {
		this();
		this.width = width;
		this.length = length;
	}

	public BoxConstructorChaining(int width, int length, int depth) {
		this.width = width;
		this.length = length;
		this.depth = depth;
	}
	
	
}
