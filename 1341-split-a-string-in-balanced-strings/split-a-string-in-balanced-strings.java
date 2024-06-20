class Solution {
    public int balancedStringSplit(String s) {
        int c1=0,c2=0,count=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='R')
            {
                c1++;
            }
            else
            {
                c2++;
            }
            if(c1==c2)
            {
                count++;
            }
        }
        return count;
    }
}