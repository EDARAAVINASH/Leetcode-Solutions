class Solution {
    public int maxVowels(String s, int k) 
    {
        int vc=0;
        for(int i=0;i<k;i++)
        {
            if(isVowel(s.charAt(i))) vc++;
        }    
        int maxi=vc;
        for(int i=k;i<s.length();i++)
        {
            if(isVowel(s.charAt(i)))
            {
                vc++;
            }
            if(isVowel(s.charAt(i-k)))
            {
                vc--;
            }
            maxi=Math.max(maxi,vc);
        }
        return maxi;
    }
    public static boolean isVowel(char c)
    {
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
}