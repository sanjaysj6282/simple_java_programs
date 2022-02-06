interface P
{
	static final int P_const=1;
	void P_method();
	

}

interface P1 extends P
{
	static final int P1_const=2;
	void P1_method();
	
}

interface P2 extends P
{
	static final int P2_const=3;
	void P2_method();
}

interface P12 extends P1,P2
{
	static final int P12_const=4;
	void P12_method();
}

class Q implements P12
{
	public void P_method()
	{
		System.out.println("P_method  "+P_const);
	}
	public void P1_method()
	{
		System.out.println("P1_method  "+P1_const);
	}
	public void P2_method()
	{
		System.out.println("P2_method  "+P2_const);
	}
	public void P12_method()
	{
		System.out.println("P12_method  "+P12_const);
	}

}

class InterfaceInheritence
{
	public static void main(String args[])
	{
		Q q=new Q();
		q.P_method();
		q.P1_method();
		q.P2_method();
		q.P12_method();
	}
}