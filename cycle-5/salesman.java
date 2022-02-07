import java.io.*;
import java.util.Scanner;
class Salesman
{
	String name;
	int code;
	int sales_amount;
	double commision;
	Salesman()
	{
		this.name="no name";
		this.code=0;
		this.sales_amount=0;
		this.commision=0;
	}
}

class InvalidSalesAmountException extends Exception
{
	InvalidSalesAmountException(String s)
	{
		super(s);
	}
}


class SalesManMain
{
	public static void main(String args[])throws IOException
	{
		Salesman salesmen[]=new Salesman[100];
		Scanner scan=new Scanner(System.in);
		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no of salesmen");
		int no=scan.nextInt();
		for(int i=0;i<no;++i)
		{
			salesmen[i]=new Salesman();
			System.out.println("Enter the name");
			salesmen[i].name=inp.readLine();
			System.out.println("Enter the code");
			salesmen[i].code=scan.nextInt();
			System.out.println("Enter the sales_amount");
			try
			{
				int amt=scan.nextInt();
				if(amt<0)throw new InvalidSalesAmountException("The sales amount is Invalid");
				salesmen[i].sales_amount=amt;
				if(amt<2000)salesmen[i].commision=amt*0.08;
				else if(amt>=200 && amt<=5000)salesmen[i].commision=amt*0.1;
				else if(amt>5000)salesmen[i].commision=amt*0.12;
			}catch(InvalidSalesAmountException e)
			{
				System.out.println("The Sales amount is Invalid");
			}
			System.out.println("The Commision is : "+salesmen[i].commision);
		}
		scan.close();
	}
}