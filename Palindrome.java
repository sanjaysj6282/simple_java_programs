class Palindrome
{
	public static void main(String args[])
	{
		boolean flag=true;
		String s="saippuakivikauppias";
		for(int i=0;i<s.length()/2;++i)
		{
			if(s.charAt(i)!=s.charAt(s.length()-i-1))flag=false;
		}
		if(flag)
			System.out.println("Palindorm");
		else
			System.out.println("Not Palindrome");
	}
}