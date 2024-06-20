class Solution 
{
    public String generateTheString(int n) 
    {
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<n-1;i++)
        {
            s1.append('a');
        }
        if(n%2==0)
        {
            s1.append('b');
        }
        else
        {
            s1.append('a');
        }
        return s1.toString();
    }
}