class Solution {
    public String largestNumber(int[] nums) 
    {
        int n=nums.length;
        String[] arr=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=String.valueOf(nums[i]);
        }    
        Arrays.sort(arr,new Comparator<String>()
        {
             public int compare(String a, String b) 
             {
                String order1=a+b;
                String order2=b+a;
                return order2.compareTo(order1);
             }
        });
        StringBuilder sb=new StringBuilder();
        for(String str:arr)
        {
            sb.append(str);
        }
        if(arr[0].equals("0")) 
        {   
            return "0";
        }
        return sb.toString();
    }
}