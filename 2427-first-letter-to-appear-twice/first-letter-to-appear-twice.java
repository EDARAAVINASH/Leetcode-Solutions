class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> set=new HashSet();
        char x='a';
        for(char c:s.toCharArray())
        {
            if(!set.add(c))
            {
                x=c;
                break;
            }
        }
        return x;
    }
}