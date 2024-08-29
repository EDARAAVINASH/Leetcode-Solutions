class Solution {
    public int[] arrayRankTransform(int[] arr) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        int[] new_arr=arr.clone();
        Arrays.sort(new_arr);
        for(int i:new_arr)
        {
            if(!map.containsKey(i))
            {
                map.put(i,map.size()+1);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}