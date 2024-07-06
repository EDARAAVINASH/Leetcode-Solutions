class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n=arr.length;
        int right=0,c=0;
        while(right<n)
        {
            if(arr[right]%2!=0)
            {
                c++;
                if(c==3)
                {
                    return true;
                }
            }
            else
            {
                c=0;
            }
            right++;
        }
        return false;
    }
}