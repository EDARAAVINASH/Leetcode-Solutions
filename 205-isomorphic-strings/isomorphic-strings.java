class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap();
        HashSet<Character> h=new HashSet();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            char d=t.charAt(i);
            if(map.containsKey(c))
            {
                if(!(map.get(c)==d))
                {
                    return false;
                }
            }
            else
            {
                if(h.contains(d))
                {
                    return false;
                }
                map.put(c,d);
                h.add(d);
            }
        }
        return true;
    }
}