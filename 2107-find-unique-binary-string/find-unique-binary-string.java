class Solution {
    public String findDifferentBinaryString(String[] nums) 
    {
        ArrayList<String> gen_bin=new ArrayList<>();
        ArrayList<String> num_bin=new ArrayList<>(Arrays.asList(nums));
        gen(nums[0].length(),gen_bin,"");  
        for(String s:gen_bin)
        {
            if(!num_bin.contains(s))
            {
                return s;
            }
        }  
        return "";
    }
    public static final void gen(int len,ArrayList<String> gen_bin,String str)
    {
        if(len==0)
        {
            gen_bin.add(str);
            return;
        }
        gen(len-1,gen_bin,str+"0");
        gen(len-1,gen_bin,str+"1");
    }
}