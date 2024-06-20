import java.util.ArrayList;

class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) 
    {
        ArrayList<Integer> l = new ArrayList<>();
        int c = 0;
        // Find all occurrences of x and store their indices in l
        for(int n = 0; n < nums.length; n++)
        {
            if(nums[n] == x)
            {
                c++;
                l.add(n);
            }
        }
        int[] ou = new int[queries.length];
        // Process each query
        for(int n = 0; n < queries.length; n++)
        {
            if(queries[n] > c) // Check if the query number is greater than the count of occurrences
            {
                ou[n] = -1;
            }
            else
            {
                ou[n] = l.get(queries[n] - 1); // Adjust the index to start from the first query
            }
        }
        return ou;
    }
}
