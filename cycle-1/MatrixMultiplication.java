class MatrixMultiplication
{
    public static void main(String args[])
    {
        int r1=3,c1=3;
        int r2=3,c2=3;
        int[][] m1={{1,2,3},{1,2,3},{1,2,3}};
        int[][] m2={{1,2,3},{1,2,3},{1,2,3}};
        int[][] res=new int[r1][c2];
		for(int i=0;i<r1;++i)
		{
			for(int j=0;j<c2;++j)
			{
				for(int k=0;k<c1;++k)
				{
					res[i][j]+=m1[i][k]*m2[k][j];
				}

				System.out.print(res[i][j]+" ");
			}

			System.out.println();
		}
    	 
	
	}

}
