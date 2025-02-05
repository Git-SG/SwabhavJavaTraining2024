package com.aurionpro.model;

public class Box {
	
	private int width;
	private int height;
	private int depth;
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	public int calculateVolume() {
		return width*height*depth;
	}

}
