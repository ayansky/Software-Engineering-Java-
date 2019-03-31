public class testCircle2D {
	public static void main(String[] args) {
		//creating an object
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		//printing the output
		System.out.printf("Circle's area is %.2f, and its perimeter is %.2f. %n", c1.getArea(), c1.getPerimeter());
		if (c1.contains(3,3)) {
			System.out.println("The circle contains the point (3,3).");
		} else {
			System.out.println("The circle does not contain the point (3,3).");
		}
		if (c1.contains(new Circle2D(4,5,10.5))) {
			System.out.println("The circle contains the circle with the center at (4,5) and radius of 10.5.");
		} else {
			System.out.println("The circle does not contain the circle with the center at (4,5) and radius of 10.5.");
		}
		if (c1.overlaps(new Circle2D(3,5,2.3))) {
			System.out.println("The circle overlaps with the circle with the center at (3,5) and radius of 2.3.");
		} else {
			System.out.println("The circle does not overlap with the circle with the center at (3,5) and radius of 2.3.");
		}
	}
}