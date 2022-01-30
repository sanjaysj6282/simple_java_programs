import java.io.*;

class MaxAverageRange
{
	public static void main(String args[])throws IOException
	{
		String file_name;
		int arr[]=new int[100];
		int arr_size=0;
		System.out.println("Enter the file name");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		file_name=br.readLine();
		BufferedReader f=null;


		try
		{	
			String line;
			f=new BufferedReader(new FileReader(file_name));
			do
			{
				line=f.readLine();
				if(line!=null)arr[arr_size++]=Integer.parseInt(line);
			}while(line!=null);


		}catch(IOException e)
		{
			System.out.println("Problem while reading the File");
		}finally
		{
			try
			{
				f.close();
			}catch(IOException e)
			{
				System.out.println("Problem while closing the file");
			}
		}
		int min=arr[0];
		int max=arr[0];
		int sum=0;
		for(int i=0;i<arr_size;++i)
		{
			if(arr[i]<min)min=arr[i];
			if(arr[i]>max)max=arr[i];
			sum+=arr[i];
		}

		System.out.println("Min : "+min);
		System.out.println("Max : "+max);
		System.out.println("Avg : "+(double)sum/(double)arr_size);
		System.out.println("Range : "+min+" - "+max);

		

	}
}