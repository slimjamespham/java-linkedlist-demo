package beans;

/*
 * The class holds data about a rectangle.
 */
public class Rectangle {
	private double length;
	private double width;
	
	/*
	 * The default constructor
	 */
	public Rectangle() {
		this.length = 0.0;
		this.width = 0.0;
	}
	
	/*
	 * The overloaded constructor
	 */
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	/*
	 * The method returns the length of a rectangle
	 * @return the length of the rectangle
	 */
	public double getLength() {
		return length;
	}

	/*
	 * The method sets the value of the rectangle's length
	 * @param length The length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/*
	 * The method returns the width of a rectangle
	 * @return the width of the rectangle
	 */
	public double getWidth() {
		return width;
	}

	/*
	 * The method sets the value of the rectangle's width
	 * @param width The width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	
	/*
	 * The method calculates the rectangle's area
	 * @return the area of the rectangle
	 */
	public double getArea() {
		return this.length * this.width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}	
}
