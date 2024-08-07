class Solution {
    public String kthDistinct(String[] arr, int k) 
    {
        Map<String,Integer> map=new HashMap<>();
        for(String str:arr)
        {
            map.put(str,map.getOrDefault(str,0)+1);
        }   
        for(String s:arr)
        {
            if(map.get(s)==1)
            {
                k--;
                if(k==0) return s;
            }
        }
        return "";
    }
}