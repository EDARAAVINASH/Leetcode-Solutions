class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int[] i:nums1)
        {
            map.put(i[0],map.getOrDefault(i[0],0)+i[1]);
        }
        for(int[] i:nums2)
        {
            map.put(i[0],map.getOrDefault(i[0],0)+i[1]);
        }
        int[][] result = map.entrySet().stream()
            .sorted(Map.Entry.comparingByKey()) 
            .map(e -> new int[]{e.getKey(), e.getValue()})
            .toArray(int[][]::new);
        
        return result;
    }
}