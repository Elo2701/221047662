package za.ac.wsu.s221047662;


public class CircleApp {

public static void main(String[] args) {
		
	 Circle object = new Circle(15,5,7);
	 

	 object.getX();
	 object.getY();
	 object.getRadius();
	 System.out.println("Radius = "+object.getRadius());
	 System.out.println("X = "+object.getX());
	 System.out.println("Y = "+object.getY());
	 object.calculateArea();
	 object.calculateCircumference();
	 object.calculateDiameter();
}
	}