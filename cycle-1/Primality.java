class Primality
{
    public static void main(String args[])
    {
		int n=123;
		boolean flag=true;
		for(int i=2;i<n/2;++i)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("The no is prime");
		}else
		{
			System.out.println("The no is not prime");
		}
    }
}
