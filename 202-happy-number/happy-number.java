class Solution 
{
    public boolean isHappy(int n) 
    {
        Set<Integer> set=new HashSet();
        while(n!=1 && !set.contains(n))     
        {
            set.add(n);
            n=sum(n);
        }
        return n==1;
    }
    public static int sum(int n)
    {
        int sum=0;
        while(n>0)
        {
            int a=n%10;
            sum=sum+a*a;
            n=n/10;
        }
        return sum;
    }
}