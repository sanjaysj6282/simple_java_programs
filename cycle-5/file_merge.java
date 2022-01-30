import java.io.*;
class FileMerge
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream f1=null;
		FileInputStream f2=null;
		FileOutputStream fout=null;
		int i;
		if(args.length!=3)
		{
			System.out.println("Insufficient Arguments");
			System.out.println("Example : java FileMerge <path to file 1> <path to file 2> <path to the output file>");
		}else
		{
			try
			{
				f1=new FileInputStream(args[0]);
				f2=new FileInputStream(args[1]);
				fout=new FileOutputStream(args[2]);
				do
				{
					i=f1.read();
					if(i!=-1)
					{
						fout.write(i);
					}
				}while(i!=-1);
				fout.write((int)'\n');
				do
				{
					i=f2.read();
					if(i!=-1)fout.write(i);
				}while(i!=-1);
			}catch(IOException e)
			{
				System.out.println("Error Reading files");
			}
			f1.close();
			f2.close();
			fout.close();
		}

	}
}
