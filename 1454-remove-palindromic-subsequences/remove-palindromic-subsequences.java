class Solution {
    public int removePalindromeSub(String s) 
    {
        int length=s.length();
        int low=0,high=length-1;
        while(low<high)
        {
            if(s.charAt(low)!=s.charAt(high))
                return 2;
            low++;
            high--;
        }    
        return 1;
    }
}