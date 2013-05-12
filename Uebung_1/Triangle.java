public class Triangle
{
	private Point p1;
	private Point p2;
	private Point p3;
	
	public Triangle(Point p1, Point p2, Point p3)
	{
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	public double perimeter()
	{
		return p1.dist(p2) + p2.dist(p3) + p3.dist(p1);
	}
	
	public Triangle midTriangle()
	{
		Point nP1 = p1.middle(p2);
		Point nP2 = p2.middle(p3);
		Point nP3 = p3.middle(p1);
		
		return new Triangle(nP1, nP2, nP3);
	}
	
	public double area()
	{
		double a = p1.dist(p2);
		double b = p2.dist(p3);
		double c = p3.dist(p1);
		
		// Satz des Heron
		double sqrt = Math.sqrt((a + b + c) * (a + b - c) * (b + c - a) * (c + a - b));
		sqrt *=  1.0/4.0;

		return sqrt;
	}

	
	public String toString()
	{
		return "p1:" + p1.toString() + " p2:" + p2.toString() + " p3:" + p3.toString();
	}
	
	public boolean equals(Object o)
	{
		if (o instanceof Triangle)
		{
			Triangle t = (Triangle)o;
			
			return 	this.p1.equals(t.p1) &&
				this.p2.equals(t.p2) &&
				this.p3.equals(t.p3);
		}	
		else 
			return false;
	}
}
