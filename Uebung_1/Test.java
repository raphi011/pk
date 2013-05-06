public class Test
{
	public static void main(String[] args)
	{
		Point p1 = new Point(3,5);
		Point p2 = new Point(0,3);
		Point p3 = new Point(-4.5, 2);
		
		System.out.println("p1: " + p1 + " p2: " + p2);
		System.out.println("p1 equals p2: " + p1.equals(p2));
		System.out.println("p1 equals p1: " + p1.equals(p1));
		
		Triangle triangle = new Triangle(p1,p2,p3);
		System.out.println("Triangle: " + triangle);
		
		Triangle midTriangle = triangle.midTriangle();
		System.out.println("midTriangle: " + midTriangle);
		
		double area = triangle.area();
		System.out.println("Triangle area: " + area);
		
		double perimeter = triangle.perimeter();
		System.out.println("Triangle perimeter: " + perimeter);
		
		System.out.println("Triangle equals null: " + triangle.equals(null));
		System.out.println("Triangle equals 0: " + triangle.equals(0));
		System.out.println("Triangle equals Triangle: " + triangle.equals(triangle));
		
		System.out.println("Triangle equals midTriangle: " + triangle.equals(midTriangle));
	}
}
