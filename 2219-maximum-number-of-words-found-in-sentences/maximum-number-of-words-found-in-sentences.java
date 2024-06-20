class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=Integer.MIN_VALUE;
      for(String s:sentences)
      {
        String[] st=s.split(" ");
        max=Math.max(st.length,max);
      }  
      return max;
    }
}