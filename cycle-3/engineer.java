class Employee
{
	String name;
	int age;
	int ph_no;
	String add;
	int salary;
	Employee(String name,int age,int ph_no,String add,int salary)
	{
		this.name=name;
		this.age=age;
		this.ph_no=ph_no;
		this.add=add;
		this.salary=salary;
	}
	void PrintSalary()
	{
		System.out.println("The salary is "+salary);
	}
}

class Officer extends Employee
{
	String specialization;
	Officer(String name,int age,int ph_no,String add,int salary,String specialization)
	{	
		super(name,age,ph_no,add,salary);
		this.specialization=specialization;

	}
}

class Manager extends Employee
{
	String department;
	Manager(String name,int age,int ph_no,String add,int salary,String department)
	{	
		super(name,age,ph_no,add,salary);
		this.department=department;
	}
}


class Employee_Program
{
	public static void main(String args[])
	{
		Officer o=new Officer("Asher",18,97477,"nice address",100000,"comp");
		Manager m=new Manager("Asherman",19,97477,"very nice address",20000,"phy");
		o.PrintSalary();
		m.PrintSalary();
	}
}