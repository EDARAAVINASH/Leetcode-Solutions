class Solution {
    public int maximumNumberOfStringPairs(String[] words) 
    {
        int c=0;
        Set<String> l=new HashSet<>();
        for(String s:words)
        {
            String s1=new StringBuilder(s).reverse().toString();
            if(l.contains(s1))
            {
                l.remove(s1);
                c++;
            }
            else
            {
                l.add(s);
            }
        }
        return c;
    }
}