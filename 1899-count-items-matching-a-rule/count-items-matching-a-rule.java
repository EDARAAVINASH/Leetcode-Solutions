class Solution 
{
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) 
    {
        int c=0;
        for(List<String> item : items)  
        {
            String type=item.get(0);
            String color=item.get(1);
            String name=item.get(2);
            if(ruleKey.equals("type") && ruleValue.equals(type))
            {
                c++;
            }
            if(ruleKey.equals("color") && ruleValue.equals(color))
            {
                c++;
            }
            if(ruleKey.equals("name") && ruleValue.equals(name))
            {
                c++;
            }
        } 
        return c; 
    }
}