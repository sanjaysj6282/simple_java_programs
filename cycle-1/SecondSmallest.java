class SecondSmallest
{
    public static void main(String args[])
    {
        int[] arr={2,10,1,4,5,6,7};
        int first,second;
        if(arr[0]>arr[1])
        {
            first=arr[1];
            second=arr[0];
        }else
        {
            first=arr[0];
            second=arr[1];
        }
        for(int i=1;i<arr.length;++i)
        {
            if(arr[i]<first)
            {
                second=first;
                first=arr[i];
            }else
            {
                if(arr[i]<second)
                {
                    second=arr[i];
                }
            }
            
        }
        System.out.println("The second smallest element is "+second);
    }
}