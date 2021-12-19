class Palindrome
{
	public static void main(String args[])
	{
		String st="racecar";
		int flag=1;
		for(int i=0;i<st.length()/2;++i)
		{
			if(st.toLowerCase().charAt(i)!=st.charAt(st.toLowerCase().length()-1-i))flag=0;
		}
		if(flag==1)
		{
			System.out.println("The String is Palindrome");
		}else
		{
			System.out.println("The String is Note palindrome");
		}
	}
}
