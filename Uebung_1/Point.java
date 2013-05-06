public class Point
{
	private double x;
	private double y;
	
	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double getX()
	{
		return this.x;	
	}
	
	public double getY()
	{
		return this.y;	
	}

	public double dist(Point p)
	{
		double nX = this.x - p.x;
		double nY = this.y - p.y; 
	
		return Math.sqrt(Math.pow(nX, 2) + Math.pow(nY, 2));
	}
	
	public Point middle(Point p)
	{
		double nX = (this.x - p.x) / 2;
		double nY = (this.y - p.y) / 2;
		
		return new Point(nX, nY);
	}

	public String toString()
	{
		return "(" + x + "," + y + ")";
	}
	
	public boolean equals(Object o)
	{
		if (o instanceof Point)
		{
			Point p = (Point)o;
			
			return this.x == p.x && this.y == p.y;	
		}
		else 
			return false;
	}
}
