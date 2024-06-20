class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] ch=s.toCharArray();
        for(int i=0,j=ch.length-1;i<j;i++,j--)
        {
            char m=(char)Math.min(ch[i],ch[j]);
            ch[i]=m;
            ch[j]=m;
        }
        return new String(ch);
    }
}