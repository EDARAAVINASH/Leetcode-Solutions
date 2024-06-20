class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum=0;
      for(int i=0;i<s.length();i++)
      {
            char c=s.charAt(i);
            int n=t.indexOf(c);
            sum=sum+Math.abs(i-n);
      }  
      return sum;
    }
}