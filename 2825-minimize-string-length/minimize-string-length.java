class Solution {
    public int minimizedStringLength(String s) 
    {
        Set<Character> set=new HashSet();
        for(char c:s.toCharArray())
        {
            set.add(c);
        }    
        return set.size();
    }
}