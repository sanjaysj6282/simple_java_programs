class CharFrequency
{
	public static void main(String args[])
	{
		String st="asherashishasherasherasher";
		char key='a';
		int count=0;
		for(int i=0;i<st.length();++i)
		{
			if(st.charAt(i)==key)
			{
				count++;
			}
		}
		System.out.println("The Character "+key+" occurs "+count+" times");
	}
}
