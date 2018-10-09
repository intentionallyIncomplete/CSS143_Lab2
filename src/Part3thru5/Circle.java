package Part3thru5;

public class Circle {

	/*
	 * Square class
	 * Begins with three constructors for different values
	 * used when creating a square.
	 * */
	private int x,y;
	private double radius;
	private String shape_Circle = "O";
	
	//No arg constructor
	//Has no action and will not create object. Simply overloads the detault no-arg constructor
	public Circle() {}
	
	//Another overloaded constructor that takes an X and Y coordinate value
	public Circle(int newX, int newY) {
		x = newX;
		y = newY;
	}
	
	//The last of the overloaded constructors.
	//Like with the previous c'tors, this one simply adds the final variable
	//assignment for the class
	public Circle(int newX, int newY, double newRadius) {
		x = newX;
		y = newY;
		radius = newRadius;
	}

	//draw() method simply outputs the String declared at class level labeled "shape_Circle"
	public void draw() {
		System.out.println(shape_Circle);
	}
	
	/*Getters & Setters*/
	public int getX() {return x;}

	public int getY() {return y;}

	public double getRadius() {return radius;}
	
	public double getArea() {return (radius*radius) * 3.14;}

	public void setX(int x) {this.x = x;}

	public void setY(int y) {this.y = y;}

	public void setRadius(double radius) {this.radius = radius;}

	//isEqual(arg1) - Boolean module that compares Square objects using their constructs
	//Since the data type being compared is integer, the `==` equivalence is used
	public boolean isEqual(Circle sq_Object) {
		//The area of the objects is checked and if they are the same along with the same radius
		//of the side, then they must be equal.
		if(this.getArea() == sq_Object.getArea() && this.radius == sq_Object.radius) {
			return true;
		}else {
			return false;
		}
	}
	
	/*
	 * This method is overridden
	 * The @Override mention is used here to tell the program 
	 * that where toString is used, to use the one marked as the override option.
	 * */
	@Override
	public String toString() {
		return "O";
	}
}
