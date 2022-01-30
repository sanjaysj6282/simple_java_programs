interface Operations
{
	double area();
	double volume();
	static final double PI=3.14;
}

class Cylinder implements Operations
{
	double radius;
	double height;
	Cylinder(double radius,double height)
	{
		this.radius=radius;
		this.height=height;
	}
	public double area()
	{
		return PI*this.radius*this.radius;
	}

	public double volume()
	{
		return PI*this.radius*this.radius*this.height;
	}
}

class CylinderMain
{
	public static void main(String args[])
	{
		Cylinder c=new Cylinder(10,20);
		System.out.println("The area is "+c.area());
		System.out.println("The volume is "+c.volume());
	}
}