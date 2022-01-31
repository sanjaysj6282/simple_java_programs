import java.io.*;
import java.util.StringTokenizer;

class IntegerDisplay
{
	public static void main(String args[])throws IOException
	{
		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string of Integers");
		String integer_string=inp.readLine();
		StringTokenizer integers=new StringTokenizer(integer_string," ");
		int sum=0;
		while(integers.hasMoreTokens())
		{
			int i=Integer.parseInt(integers.nextToken());
			sum+=i;
			System.out.println(i);
		}
		System.out.println("The sum is "+sum);
	}
}