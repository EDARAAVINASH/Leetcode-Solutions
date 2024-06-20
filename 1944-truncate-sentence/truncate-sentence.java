class Solution {
    public String truncateSentence(String s, int k) {
        String[] st=s.split(" ");
        String s1="";
        for(int i=0;i<k;i++)
        {
            s1=s1+st[i];
            if(i<k-1)
            {
                s1=s1+" ";
            }
        }    
        return s1;
    }
}