class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) 
    {
        int n=sum(x); 
        if(x%n==0)
            return n;
        return -1;   
    }
    public static int sum(int num)
    {
        int sum=0;
        while(num>0)
        {
            sum=sum+num%10;
            num=num/10;
        }
        return sum;
    }
}