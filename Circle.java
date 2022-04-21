package za.ac.wsu.s221047662;

public class Circle {
	
	private float radius;
	private int x;
	private int y;
	

	public Circle(float radius, int x, int y) {
		this.radius=radius;
		this.x=x;
		this.y=y;
		}
	
	
   public void setRadius(float radius) {
		this.radius=radius;              
   }                                    
	
   public void setX(int x) {
		this.x=x;   
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public float getRadius(){
		return radius;          
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	void calculateArea(){

		   System.out.println("Area : "+3.14*(getRadius()*getRadius()));
		}

		void calculateCircumference(){

		  System.out.println("Circumference : "+2*3.14*radius);

		}


		void calculateDiameter(){

		 System.out.println("Diameter : "+getRadius()+getRadius());

		}


	

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
