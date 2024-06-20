class Solution {
    public String firstPalindrome(String[] words) {
        for(String s:words)
        {
            String s1=new StringBuilder(s).reverse().toString();
            if(s.equals(s1))
            {
                return s;
            }
        }
        return new String("");
    }
}