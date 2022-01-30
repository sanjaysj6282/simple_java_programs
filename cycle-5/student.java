import java.util.Scanner;
import java.io.*;
class Student
{
	public String name;
	public int rollno;
	public int age;
	Student()
	{
		name="no name";
		age=0;
		rollno=0;
	}
}
class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		super(s);
	}
}


class StudentMain
{
	public static void main(String args[])throws IOException
	{
		Scanner scan=new Scanner(System.in);
		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no of students");
		int no=scan.nextInt();
		Student students[]=new Student[100];

		
		for(int i=0;i<no;++i)
		{	
			students[i]=new Student();
			System.out.println("Enter the name");
			students[i].name=inp.readLine();
			System.out.println("Enter the age");
			try
			{
				students[i].age=scan.nextInt();
				if(students[i].age<15 || students[i].age>21)
				{
					throw new InvalidAgeException("The Age is below 15 or above 21");
				}
			}catch(InvalidAgeException e)
			{
				System.out.println("Not a valid age");
			}
			System.out.println("Enter the rollno");
			students[i].rollno=scan.nextInt();
		}
		scan.close();
	}
}