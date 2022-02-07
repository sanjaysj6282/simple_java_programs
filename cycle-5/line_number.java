import java.io.*;

class LineNumber
{
	public static void main(String args[])throws IOException
	{
		BufferedReader f1=null;
		PrintWriter f2=null;
		String line;
		int i=1;
		
		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter the name of the source file");
			f1=new BufferedReader(new FileReader(inp.readLine()));
			System.out.println("Enter the name of destination file");
			f2=new PrintWriter(inp.readLine());
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