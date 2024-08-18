class Solution {
    public int appendCharacters(String s, String t) 
    {
        int len1=s.length(),len2=t.length(),p1=0,p2=0;
        while(p1<len1 && p2<len2)
        {
            char c1=s.charAt(p1);
            char c2=t.charAt(p2);
            if(c1==c2) 
            {
                p1++;
                p2++;
            }
            else
            {
                p1++;
            }
        }    
        return len2-p2;
    }
}