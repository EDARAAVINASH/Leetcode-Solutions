class Solution {
    public String sortSentence(String s) {
        String[] arr=s.split(" ");
        String[] b=new String[arr.length];
        String s2="";
        for(String s1:arr)
        {
            int x=s1.charAt(s1.length()-1)-'0';
            b[x-1]=s1.substring(0,s1.length()-1);
        }
        for(String s1:b)
        {
            s2=s2+s1+" ";
        }
        return s2.trim();
    }
}