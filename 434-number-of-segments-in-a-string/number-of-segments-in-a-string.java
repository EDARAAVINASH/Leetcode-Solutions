import java.util.*;
class Solution {
    public int countSegments(String s) 
    {
        StringTokenizer str=new StringTokenizer(s);
        return str.countTokens();
    }
}