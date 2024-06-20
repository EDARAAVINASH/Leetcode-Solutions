class Solution {
    public String toLowerCase(String s) {
        String s1="";
        for(char c:s.toCharArray())
        {
            if(c>=65 && c<=90)
            {
                s1=s1+(char)(c+32);
            }
            else
            {
                s1=s1+c;
            }
        }
        return s1;
    }
}