class Solution {
    public int minimumChairs(String s) {
        int max=Integer.MIN_VALUE;
        int c1=0;
       for(int i=0;i<s.length();i++)
       {
           char c=s.charAt(i);
           if(c=='E')
           {
               c1++;
           }
           else if(c=='L')
           {
               c1--;
           }
           max=Math.max(c1,max);
       }
       return max;
    }
}