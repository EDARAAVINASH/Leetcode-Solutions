class Solution {
    public String sortString(String s) 
    {
        int alpha[]=new int[26];
        for(char c:s.toCharArray())
        {
            alpha[c-'a']++;
        } 
        StringBuilder sb=new StringBuilder();
        while(sb.length()<s.length())
        {
            for(int i=0;i<26;i++)
            {
                if(alpha[i]>0)
                {
                    sb.append((char)(i+'a'));
                    alpha[i]--;
                }
            }
            for(int i=25;i>=0;i--)
            {
                if(alpha[i]>0)
                {
                    sb.append((char)(i+'a'));
                    alpha[i]--;
                }
            }
        }   
        return sb.toString();
    }
}