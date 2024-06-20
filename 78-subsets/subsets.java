class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list1=new ArrayList<>();
        for(int i=0;i<Math.pow(2,nums.length);i++)
        {
            list1.add(valid(i,nums));
        }
        return list1;
    }
    public static List<Integer> valid(int i,int[] nums)
    {
        List<Integer> list=new ArrayList<>();
        int c=0;
        while(i>0)
        {
            if((i & 1)==1)
            {
                list.add(nums[c]);
            }
            c++;
            i=i>>1;
        }
        return list;
    }
}