class Solution {
    public int distinctPrimeFactors(int[] nums) {
       long n=1;
       Set<Integer> c=new HashSet();
       for(int i:nums)
       {
            for(int j=2;j<=i;j++)
            {
                if(i%j==0)
                {
                    c.add(j);
                    while(i%j==0)
                    {
                        i=i/j;
                    }
                }
            }
       }
       return c.size();
    }
}