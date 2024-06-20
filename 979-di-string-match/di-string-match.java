class Solution {
    public int[] diStringMatch(String s) {
        int len=s.length();
        int a[]=new int[s.length()+1];
        int ij=0,d=len;
        for(int i=0;i<len;i++)
        {
            char c=s.charAt(i);
            a[i]=(c=='I')?ij++:d--;
        }
        a[len]=d;
        return a;
    }
}