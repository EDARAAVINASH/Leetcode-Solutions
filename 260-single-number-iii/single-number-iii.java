class Solution {
    public int[] singleNumber(int[] nums) {
        int b=0;
        for(int n:nums)
        {
            b^=n;
        }
        int rmsb=b&-b;
        int a[]=new int[2];
        for(int val:nums)
        {
            if((val & rmsb)==0)
            {
                a[0]=a[0]^val;
            }
            else
            {
                a[1]=a[1]^val;
            }
        }
        return a;
    }
}