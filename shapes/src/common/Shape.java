package common;

abstract class Shape {
	private int x;
	private int y;

	// constructor
	Shape(int x, int y) {
		moveTo(x, y);
		
	}

	// accessors for x & y
	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	void setX(int x) {
		this.x = x;
	}

	void setY(int y) {
		//System.out.println("Y was: " +this.y);
		//System.out.println("Y is now: " +y);
		
		this.y = y;
		
	}

	// move the x & y position
	void moveTo(int x, int y) {
		setX(x);
		setY(y);
	}

	void rMoveTo(int deltax, int deltay) {
		moveTo(getX() + deltax, getY() + deltay);
	}

	// virtual draw method
	abstract void draw();
}
