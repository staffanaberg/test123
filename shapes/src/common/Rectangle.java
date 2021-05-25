package common;

public class Rectangle extends Shape {
	private int width;
	private int height;

	// constructor
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		setWidth(width);
		setHeight(height);

	}

	// accessors for the width & height
	int getWidth() {
		return width;
	}

	int getHeight() {
		return height;
	}

	void setWidth(int width) {
		this.width = width;
	}

	void setHeight(int height) {
		this.height = height;
	}

	// draw the rectangle
	void draw() {
		System.out.println("Drawing a Rectangle at:(" + getX() + ", " + getY() + "), width " + getWidth() + ", height "
				+ getHeight());
	}
}
