class TransposeMatrix
{
    public static void main(String args[])
    {
		int r=3,c=3;
		int[][] mat={{1,2,3},{1,2,3},{1,2,3}};
		int[][] t_mat=new int[c][r];
		for(int i=0;i<r;++i)
		{
			for(int j=0;j<c;++j)
			{
				t_mat[j][i]=mat[i][j];
				
			}
		}

		//System.out.println("asd "+t_mat[0].length+" asd");
		for(int i=0;i<c;++i)
		{
			for(int j=0;j<r;++j)
			{
				//System.out.println(i+" "+j);
				System.out.print(t_mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
