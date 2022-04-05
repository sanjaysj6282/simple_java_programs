import java.io.*;
class NoOfPart
{
	public static void main(String args[])
	{
		FileInputStream f1=null;
		int i;
		int chars=0,spaces=0,lines=0;
		try
		{
			f1=new FileInputStream(args[0]);
			do
			{
				i=f1.read();
				if(i==(int)' ')spaces++;
				if(i==(int)'\n')
				{
					spaces++;
					lines++;
				}
				chars++;

			}while(i!=-1);

		}catch(IOException e)
		{
			System.out.println("Error in Opening the file");
		}
			try
			{
				f1.close();
			}catch(IOException e)
			{
				System.out.println("Error in closing the file");
			}
		
		System.out.println("NO of characters : "+chars);
		System.out.println("NO of words : "+(spaces+1));
		System.out.println("NO of lines : "+(lines+1));
	}
}