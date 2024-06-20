class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len=strs[0].length();
        String out="";
        for(int i=0;i<len;i++)
        {
            char c=strs[0].charAt(i);
            int count=0;
            for(int j=1;j<strs.length;j++)
            {
                if(i<strs[j].length() && strs[j].charAt(i)==c)
                {
                    count++;
                }
                else
                {
                    return out;
                }
            }
            if(count==strs.length-1)
            {
                out=out+c;
            }
        }
        return out;
    }
}