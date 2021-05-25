package common;

public class Circle extends Shape {
	private int radius;
	private String name;

	// constructor
	public Circle(int x, int y, int radius, String name) {
		super(x, y);
		setRadius(radius);
		//this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setName() {
		name = "Pacman";
	}

	// accessors for the radius
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// draw the circle
	public void draw() {
		System.out.println("Drawing a Circle at:(" + getX() + ", " + getY() + "), radius " + getRadius());
	}
}
