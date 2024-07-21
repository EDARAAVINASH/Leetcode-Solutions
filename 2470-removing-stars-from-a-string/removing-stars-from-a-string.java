class Solution {
    public String removeStars(String s) 
    {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(c=='*')
            {
                int len=sb.length();
                if(len>0)
                {
                    sb.deleteCharAt(len-1);
                }
            }
            else
            {
                sb.append(c);
            }
        }    
        return sb.toString();
    }
}