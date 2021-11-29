class ReverseString
{
    public static void main(String args[])
    {
        String st="nice";
        String reverse="";
        for(int i=st.length()-1;i>=0;i--)
        {
            reverse+=st.charAt(i);
        }
        System.out.println("The reverse of "+st+" is "+reverse);
    }
}