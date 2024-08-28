class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        List<Boolean> list=new ArrayList<>();
        int maxi=Integer.MIN_VALUE;
        for(int i:candies)
        {
            maxi=Math.max(i,maxi);
        }
        for(int i:candies)
        {
            list.add(i+extraCandies>=maxi);
        }
        return list;
    }
}