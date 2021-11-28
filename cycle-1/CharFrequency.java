class CharFrequency
{
    public static void main(String args[])
    {
        String s="asherasherashish";
        char c='a';
        int freq=0;
        for(char ch:s.toCharArray())
        {
            if(ch==c)
                freq++;
        }
        System.out.println("The Frequency of "+c+" is "+freq);

    }
}