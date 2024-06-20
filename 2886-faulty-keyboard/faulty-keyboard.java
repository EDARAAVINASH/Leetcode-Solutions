class Solution {
    public String finalString(String s) {
      StringBuilder b=new StringBuilder();
      for(char c:s.toCharArray())
      {
        if(c=='i')
        {
            b=b.reverse();
        }
        else
        {
            b.append(c);
        }
      }  
      return b.toString();
    }
}