class TransposeMatrix
{
    public static void main(String args[])
    {   
        int r=3,c=3;
        int[][] mat={{1,2,3},{1,3,3},{1,2,3}};
        int[][] transposemat=new int[r][c];
        for(int i=0;i<r;++i)
        {
            for(int j=0;j<c;++j)
            {
                transposemat[j][i]=mat[i][j];
            }
        }
        for(int i=0;i<c;++i)
        {
            for(int j=0;j<r;++j)
            {
                System.out.print(transposemat[i][j]+" ");
            }
            System.out.println();
        }
    }
}