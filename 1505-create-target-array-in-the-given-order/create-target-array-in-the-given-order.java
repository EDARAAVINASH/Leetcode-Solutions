class Solution {
    public int[] createTargetArray(int[] nums, int[] index) 
    {
        List<Integer> list1=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            list1.add(index[i],nums[i]);
        }   
        int[] target=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            target[i]=list1.get(i);
        }
        return target;
    }
}