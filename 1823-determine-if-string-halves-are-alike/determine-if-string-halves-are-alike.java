class Solution {
    public boolean halvesAreAlike(String s) {
        String s1=s.substring(0,s.length()/2);
        String s2=s.substring(s.length()/2);
        int cou1=0,cou2=0;
        for(int i=0;i<s1.length();i++)
        {
            char c1=s1.charAt(i);
            if(vowel(c1))
                cou1++;
            char c2=s2.charAt(i);
            if(vowel(c2))
                cou2++;
        }
        return cou1==cou2;
    }
    public boolean vowel(char c)
    {
        return "aeiouAEIOU".contains(String.valueOf(c));
    }
}