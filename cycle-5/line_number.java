import java.io.*;

class LineNumber
{
	public static void main(String args[])throws IOException
	{
		BufferedReader f1=null;
		PrintWriter f2=null;
		String line;
		int i=1;
		try
		{
			f1=new BufferedReader(new FileReader(args[0]));
			f2=new PrintWriter(args[1]);
			do
			{	
				line=f1.readLine();
				if(line!=null)f2.println(i+"."+line);
				i++;
			}while(line!=null);

		}catch(IOException e)
		{
			System.out.println("Error in opening the files");
		}
		finally
		{
			try
			{
				f1.close();
				f2.close();
			}catch(IOException e)
			{
				System.out.println("Error in closing the file");
			}
		}
	}
}