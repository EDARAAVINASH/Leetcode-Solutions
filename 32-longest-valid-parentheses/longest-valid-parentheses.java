class Solution {
    public int longestValidParentheses(String s) 
    {
        int left=0,right=0,maxi=0;
        for(char c:s.toCharArray())
        {
            if(c=='(') left++;
            else if(c==')') right++;
            if(right>left)
            {
                left=0;
                right=0;
            }
            if(left==right)
            {
                maxi=Math.max(maxi,left*2);
            }
        }
        left=0;right=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            if(c=='(') left++;
            else if(c==')') right++;
            if(left>right)
            {
                left=0;
                right=0;
            }
            if(left==right)
            {
                maxi=Math.max(maxi,left*2);
            }
        }
        return maxi;   
    }
}
