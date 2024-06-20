class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> s=new HashSet();
        for(char c:allowed.toCharArray())
        {
            s.add(c);
        }
        int x=0;
        for(String st:words)
        {
            boolean b=true;
            for(char ch:st.toCharArray())
            {
                if(s.contains(ch))
                {
                }
                else
                {
                    b=false;
                    break;
                }
            }
            if(b)
            {
                x++;
            }
        }
        return x;
    }
}