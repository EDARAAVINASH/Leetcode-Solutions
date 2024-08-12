class Solution {
    public List<String> validStrings(int n) {
        List<String> result=new ArrayList<>();
        generate("",n,result);
        return result;
    }
    public static void generate(String s,int n,List<String> result)
    {
        if (s.length() == n && !s.contains("00")) {
            result.add(s);
            return;
        }
        if(s.isEmpty() || s.charAt(s.length()-1)!='0')
        {
            generate(s + '0', n, result);
        }
        generate(s + '1', n, result);
    }
}