class Solution 
{
    public void setZeroes(int[][] matrix) 
    {
        int x=0;
        boolean a[]=new boolean[matrix.length];
        boolean b[]=new boolean[matrix[0].length];
        for(int j=0;j<matrix.length;j++)
        {
            for(int i=0;i<matrix[0].length;i++)
            {
                if(matrix[j][i]==0)
                {
                    a[j]=true;
                    b[i]=true;
                    //break;
                }
            }
        }
        for(int j=0;j<matrix.length;j++)
        {
            for(int i=0;i<matrix[0].length;i++)
            {
                if(b[i] || a[j])
                {
                    matrix[j][i]=0;
                }
            }
        }
    }
}