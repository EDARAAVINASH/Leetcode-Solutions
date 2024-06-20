class Solution {
    public int lengthOfLastWord(String s) {
        s=s.replaceAll("//s+"," ");
        String[] st=s.split(" ");
        return st[st.length-1].length();
    }
}