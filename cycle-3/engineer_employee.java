class Employee
{
	int salary=100;
	void display()
	{
		System.out.println(salary);
	}
	void calcSalary()
	{
		System.out.println("The salary is "+salary);
	}
}

class Engineer
{
	int salary=120;
	void calcSalary()
	{
		System.out.println("The salary is "+salary);
	}
}

class EE
{
	public static void main(String args[])
	{
		Engineer e=new Engineer();
		e.calcSalary();
		// super.calcSalary();

	}
}
