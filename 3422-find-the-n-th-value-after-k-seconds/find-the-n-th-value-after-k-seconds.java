class Solution {
    public int valueAfterKSeconds(int n, int k) {
        ArrayList<Integer> a=new ArrayList(n);
        for(int i=0;i<n;i++)
        {
            a.add(1);
        }
        for(int i=0;i<k;i++)
        {
            for(int j=1;j<n;j++)
            {
                a.set(j,(a.get(j-1)+a.get(j))%1000000007);
            }
        }
        return a.get(n-1);
    }
}