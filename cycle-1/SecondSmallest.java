class SecondSmallest
{
    public static void main(String args[])
    {
		int arr[]={1,1,1,2,3,4,6};
		int first=Integer.MAX_VALUE,second=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;++i)
		{
			if(arr[i]<first)first=arr[i];
		}
		for(int i=0;i<arr.length;++i)
		{
			if(arr[i]<second && arr[i]!=first)second=arr[i];
		
    	}
		System.out.println("The Second smallest number is "+second);
	}
}
