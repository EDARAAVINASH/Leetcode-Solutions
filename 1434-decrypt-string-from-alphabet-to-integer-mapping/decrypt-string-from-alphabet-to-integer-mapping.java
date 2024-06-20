class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();)
        {
            char c=s.charAt(i);
            if(i+2<s.length() && s.charAt(i+2)=='#')
            {
                sb.append((char)(Integer.valueOf(s.substring(i,i+2))+'a'-1));
                i=i+3;
            }
            else
            {
                sb.append((char)((c-'0')+'a'-1));
                i++;
            }
        }
        return sb.toString();
    }
}