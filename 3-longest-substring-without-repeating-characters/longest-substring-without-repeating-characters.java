class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length(),l=0,r=0,maxlen=0,len=0;
        int arr[]=new int[256];
        Arrays.fill(arr,-1);
        while(r<n)
        {
            char c=s.charAt(r);
            if(arr[c]!=-1)
            {
                if(arr[c]>=l)
                {
                    l=arr[c]+1;
                }
            }
            len=r-l+1;
            maxlen=Math.max(len,maxlen);
            arr[c]=r;
            r++;
        }
        return maxlen;
    }
}