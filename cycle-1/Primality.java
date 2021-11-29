class Primality
{
    public static void main(String args[])
    {
        int no=7919;
        boolean flag=true;
        for(int i=2;i<no/2;++i)
        { 
            if(no%i==0)flag=false;
        }
        if(flag)
        {
            System.out.println("The Number is Prime");
        }else
        {
            System.out.println("The Number is not Prime");
        }
    }
}