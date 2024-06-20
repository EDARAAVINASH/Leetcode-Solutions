class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        for(String st:words)
        {
            if(st.startsWith(pref))
            {
                c++;
            }
        }
        return c;
    }
}