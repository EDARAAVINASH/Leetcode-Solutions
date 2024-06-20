class Solution {
    public int maxDepth(String s) {
        int max=0,max1=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            {
                max++;
                max1=Math.max(max1,max);
            }
            else if(c==')')
            {
                max--;
            }
        }
        return max1;
    }
}