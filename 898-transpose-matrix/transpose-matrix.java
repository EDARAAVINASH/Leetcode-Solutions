class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] m=new int[matrix[0].length][matrix.length];
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[0].length;j++)
            {
                m[i][j]=matrix[j][i];
            }
        }
        return m;
    }
}