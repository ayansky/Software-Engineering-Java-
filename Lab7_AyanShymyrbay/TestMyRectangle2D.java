
public class TestMyRectangle2D {

	public static void main(String[] args) {
		 
		MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
		//Area and Perimeter
		System.out.println(" Area is " + r1.getArea() + " and perimeter is "+ r1.getPerimeter());
		
		//point
		if(r1.contains(3,3))
			System.out.println("Rectangle contains");
		else
			System.out.println("Rectangle does not contain");
		
		//rectangle contains
		if(r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)))
			System.out.println("Rectangle contains another rectangle");
		else
			System.out.println("Rectangle does not contain another rectangle");
		
		//overlaps
		
		if(r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)))
			System.out.println("Rectangle overlaps another rectangle");
		else
			System.out.println("Rectangle does not overlap another rectangle");
	}

}
