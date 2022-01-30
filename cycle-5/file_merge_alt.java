import java.io.*;
class FileMergeAlt
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader f1=null;
		BufferedReader f2=null;
		PrintWriter fout=null;
		String line1,line2;
		if(args.length!=3)
		{
			System.out.println("Insufficient Arguments");
			System.out.println("Example : java FileMerge <path to file 1> <path to file 2> <path to the output file>");
		}else
		{
			try
			{
				f1=new BufferedReader(new FileReader(args[0]));
				f2=new BufferedReader(new FileReader(args[1]));
				fout=new PrintWriter(args[2]);
				do
				{
					line1=f1.readLine();
					line2=f2.readLine();
					if(line1!=null)
					{
						fout.println(line1);
					}
					if(line2!=null)
					{
						fout.println(line2);
					}
				}while(line1!=null || line2!=null);
				
			}catch(IOException e)
			{
				System.out.println("Error Reading files");
			}
			finally
			{
				try
				{
					f1.close();
					f2.close();
					fout.close();
				}catch(IOException e)
				{
					System.out.println("Error Occured in closing the file");
				}
			}
		}

	}
}
