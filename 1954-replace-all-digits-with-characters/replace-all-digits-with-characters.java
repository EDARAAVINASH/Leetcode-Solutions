class Solution {
    public String replaceDigits(String s) {
        char[] ch=s.toCharArray();
        for(int i=1;i<s.length();i=i+2)
        {
            char c=s.charAt(i);
            ch[i]=(char)(s.charAt(i-1)+(c-'0'));
        }
        return new String(ch);
    }
}