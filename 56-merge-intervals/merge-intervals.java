class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
        int n=intervals.length;
        List<int[]> ans=new ArrayList();
        for(int[] i:intervals)
        {
            if(ans.isEmpty() || ans.get(ans.size()-1)[1] < i[0])
            {
                ans.add(i);
            }
            else
            {
                ans.get(ans.size()-1)[1]=Math.max(ans.get(ans.size()-1)[1],i[1]);
            }
        }
        return ans.toArray(int[][]::new);
    }
}