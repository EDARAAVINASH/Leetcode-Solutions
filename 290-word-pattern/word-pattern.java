class Solution {
    public boolean wordPattern(String pattern, String s) 
    {
        Map<Character,String> map=new HashMap<>();
        s=s.trim().replaceAll("\\s+"," ");
        String[] str=s.split(" ");
        if(pattern.length()!=str.length) return false;
        for(int i=0;i<pattern.length();i++)
        {
            char c=pattern.charAt(i);
            String curr=str[i];
            if(map.containsKey(c))
            {
                if(!map.get(c).equals(curr))
                {
                    return false;
                }
            }
            else
            {
                if(map.containsValue(curr))
                    return false;
                map.put(c,curr);
            }
        }
        return true;   
    }
}