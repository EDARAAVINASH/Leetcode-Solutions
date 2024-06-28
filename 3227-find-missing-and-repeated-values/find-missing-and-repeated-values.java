class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long n=grid.length*grid[0].length;
        long sum=0,sqr=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                sum=sum+grid[i][j];
                sqr=sqr+(long)grid[i][j]*grid[i][j];
            }
        }
        long totsum=(n*(n+1))/2;
        long sqrsum=(n*(n+1)*(2*n+1))/6;
        long diff=sum-totsum;
        if (diff == 0) {
            return new int[] {-1, -1}; 
        }
        long diff1=(sqr-sqrsum)/diff;
        long x=(diff+diff1)/2;
        long y=diff1-x;
        return new int[]{(int)x,(int)y};
    }
}