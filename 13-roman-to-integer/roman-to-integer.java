class Solution {
    public int romanToInt(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++)
        {
            char c=s.charAt(i);
            intval(c);
            int x=intval(s.charAt(i));
            int y=intval(s.charAt(i+1));
            if(x<y)
            {
                sum=sum-x;
            }
            else
            {
                sum=sum+x;
            }
        }
        sum=sum+intval(s.charAt(s.length()-1));
        return sum;
    }
    public int intval(char c)
    {
        switch(c)
        {
            case 'M':return 1000;
            case 'D':return 500;
            case 'C':return 100;
            case 'L':return 50;
            case 'X':return 10;
            case 'V':return 5;
            case 'I':return 1;
        }
        return 0;
    } 
}