class Solution {
    public int minSteps(String s, String t) {
        char c[]=s.toCharArray();
        char d[]=t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        int i=0,j=0,count=0;
        while(i<c.length && j<d.length)
        {
            if(c[i]==d[j]) 
            {
                i++;j++;
                count++;
            }
            else if(c[i]>d[j])
            {
                j++;
            }
            else
            {
                i++;
            }
        }
        return c.length-count;
    }
}