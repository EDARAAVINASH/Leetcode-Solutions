class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        String s1="";
        for(String st:arr)
        {
            for(int i=st.length()-1;i>=0;i--)
            {
                s1=s1+st.charAt(i);
            }
            s1=s1+" ";
        }
        return s1.trim();
    }
}