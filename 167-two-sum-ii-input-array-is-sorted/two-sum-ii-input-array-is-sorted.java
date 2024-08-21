class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
        int low=0,high=numbers.length-1;
        while(low<high)
        {
            int val=numbers[low]+numbers[high];
            if(val==target)
            {
                return new int[]{low+1,high+1};
            }
            else if(val>target)
            {
                high--;
            }
            else
            {
                low++;
            }
        }    
        return new int[]{-1,-1};
    }
}