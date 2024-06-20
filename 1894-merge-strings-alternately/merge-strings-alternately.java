class Solution 
{
    public String mergeAlternately(String word1, String word2) 
    {
        int i=0,j=0;
        StringBuilder s1=new StringBuilder();
        while(i<word1.length() && j<word2.length())
        {
            s1.append(word1.charAt(i));i++;
            s1.append(word2.charAt(j));j++;
        } 
        while(i<word1.length())
        {
            s1.append(word1.charAt(i));
            i++;
        }
        while(j<word2.length())
        {
            s1.append(word2.charAt(j));
            j++;
        }
        return s1.toString();
    }
}