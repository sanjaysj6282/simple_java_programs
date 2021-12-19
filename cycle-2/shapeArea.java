import java.lang.Math;

class shapeArea
{
	public double area(double r)
	{
		return(3.14*r*r);
	}
	public float area(float length,float breadth)
	{
		return(length*breadth);
	}	
	public float area(float s1,float s2,float s3)
	{
		float s=(s1+s2+s3)/2;
		return 1.00;
	}


}

class Area
{
	public static void main(String args[])
	{
		shapeArea sh=new shapeArea();
		System.out.println(sh.area(3));
	}
}

