class Solution {
    public String decodeMessage(String key, String message) {
        LinkedHashSet<Character> l=new LinkedHashSet();
        String s1="";
        for(char c:key.toCharArray())
        {
            l.add(c);
        }
        l.remove(' ');
        for(char c:message.toCharArray())
        {
            int n=0;
            if(Character.isLetter(c))
            {
                for(char ch:l)
                {
                    if(c==ch)
                    {
                        break;
                    }
                    n++;
                }
                s1=s1+(char)('a'+n);
            }
            else
            {
                s1=s1+c;
            }
        }
        return s1;
    }
}