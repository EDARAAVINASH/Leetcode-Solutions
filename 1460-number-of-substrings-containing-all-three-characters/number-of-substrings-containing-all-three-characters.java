class Solution {
    public int numberOfSubstrings(String s) {
        int l=0,r=0,n=s.length();
        int a[]={-1,-1,-1};
        int sum=0;
        while(r<n)
        {
            char c=s.charAt(r);
            a[c-'a']=r;
            if(a[0]!=-1 && a[1]!=-1 && a[2]!=-1)
            {
                sum=sum+(1+Math.min(a[0],Math.min(a[1],a[2])));
            }
            r++;
        }
        return sum;
    }
}