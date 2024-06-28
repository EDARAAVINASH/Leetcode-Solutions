class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int n = rows * cols;
        
        long sum = 0, sqr = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += grid[i][j];
                sqr += (long)grid[i][j] * grid[i][j];
            }
        }

        long totsum = (long)n * (n + 1) / 2;
        long sqrsum = (long)n * (n + 1) * (2 * n + 1) / 6;

        long diff = sum - totsum;
        if (diff == 0) {
            return new int[] {-1, -1};
        }
        
        long diff1 = (sqr - sqrsum) / diff;

        long repeated = (diff + diff1) / 2;
        long missing = diff1 - repeated;

        return new int[] {(int)repeated,(int)missing};
    }
}
