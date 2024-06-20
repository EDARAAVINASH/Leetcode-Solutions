class Solution {
    public int countPrimes(int n) {
        if(n<=1) return 0;
        int c=-2;
        boolean a[]=new boolean[n];
        Arrays.fill(a,true);
        for(int i=2;i*i<n;i++)
        {
            if(a[i]==true)
            {
                for(int j=i*i;j<n;j=j+i)
                {
                    a[j]=false;
                }
            }
        }
        for(boolean i:a)
        {
            if(i==true)
            {
                c++;
            }
        }
        return c;
    }
}