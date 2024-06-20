class Solution {
    public String reversePrefix(String word, char ch) {
        int i=word.indexOf(ch);
        StringBuilder sb=new StringBuilder(word.substring(0,i+1)).reverse();
        return sb.toString()+word.substring(i+1);
    }
}