interface Area
{
	double area();

}

interface Volume
{
	double volume();
}
class Shape
{
	String name;
	Shape(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
}

class Circle extends Shape implements Area
{
	double radius;
	Circle(double r,String n)
	{
		super(n);
		this.radius=r;
	}
	public double area()
	{
		return (3.14*this.radius*this.radius);
	}

}

class Square extends Shape implements Area
{	
	double side;
	Square(double s,String n)
	{
		super(n);
		this.side=s;
	}
	public double area()
	{
		return this.side*this.side;
	}

}

class Cylinder extends Circle implements Volume
{
	double height;
	Cylinder(double h,double r,String n)
	{
		super(r,n);
		this.height=h;
	}
	public double volume()
	{
		return 3.14*this.radius*this.radius*this.height;
	}

}

class Sphere extends Circle implements Volume
{
	Sphere(double r,String n)
	{	
		super(r,n);
		

	}
	public double volume()
	{
		return 1.3*3.14*this.radius*this.radius*this.radius;
	}
}


class Cube extends Square implements Volume
{
	Cube(double s,String n)
	{
		super(s,n);
	}
	public double volume()
	{
		return this.side*this.side*this.side;
	}

}

class Glome extends Sphere implements Volume
{	
	Glome(double r,String n)
	{
		super(r,n);
	}
	public double volume()
	{
		return 0.5*3.14*3.14*this.radius*this.radius*this.radius*this.radius;
	}

}


class Geometry
{
	public static void main(String args[])
	{
		Area a=new Circle(10,"Circle1");
		Square s=new Square(10,"Square1");
		Cylinder c=new Cylinder(10,10,"Cylinder1");
		Sphere sp=new Sphere(10,"Sphere1");
		Cube cb=new Cube(10,"Cube1");
		Glome g=new Glome(10,"Glome1");

		System.out.println(a.getName()+" "+a.area());
		System.out.println(s.getName()+" "+s.area());
		System.out.println(c.getName()+" "+c.volume());
		System.out.println(sp.getName()+" "+sp.volume());
		System.out.println(cb.getName()+" "+cb.volume());
		System.out.println(g.getName()+" "+g.volume());


	}
}