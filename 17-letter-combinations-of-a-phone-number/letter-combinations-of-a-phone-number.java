class Solution {
    public List<String> letterCombinations(String digits) 
    {
        if(digits.length()==0) return new ArrayList<>();
        String[] arr={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ans=new ArrayList<>();
        findr(digits,0,new StringBuilder(),arr,ans); 
        return ans; 
    }
    public static void findr(String digits,int i,StringBuilder sb,String[] arr,List<String> ans)
    {
        if(i==digits.length())
        {
            ans.add(sb.toString());
            return;
        }
        for(char c:arr[digits.charAt(i)-'0'].toCharArray())
        {
            sb.append(c);
            findr(digits,i+1,sb,arr,ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}