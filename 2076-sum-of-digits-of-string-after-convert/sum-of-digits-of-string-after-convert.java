class Solution {
    public int getLucky(String s, int k) 
    {
        int n=Integer.MIN_VALUE;
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray())
        {
            sb.append((int)c-96);
        }    
        String str=sb.toString();
        n=con(str);
        while(k-->1)
        {
            n=conv_int(n);
        }
        return n;
    }
    public static int con(String s)
    {
        int sum=0;
        for(char c:s.toCharArray())
        {
            sum+=c-'0';
        }
        return sum;
    }
    public static int conv_int(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}