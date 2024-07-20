class Solution 
{
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>> ans=new ArrayList<>();
        find(candidates,0,target,new ArrayList<Integer>(),ans);
        return ans;
    }
    public static void find(int[] nums,int idx,int target,List<Integer> a,List<List<Integer>> ans)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(a));
            return;
        }
        if(target<0) return;
        for(int i=idx;i<nums.length;i++)
        {
            a.add(nums[i]);
            find(nums,i,target-nums[i],a,ans);
            a.remove(a.size()-1);
        }
    }
}