class Solution {
    public int countPoints(String rings) {
        Set<Character>[] set=new Set[10];
        int count=0;
        for(int i=0;i<10;i++)
        {
            set[i]=new HashSet();
        }
        for(int i=0;i<rings.length();i+=2)
        {
            char c=rings.charAt(i);
            int x=rings.charAt(i+1)-'0';
            set[x].add(c);
        }
        for(Set<Character> rod:set)
        {
            if(rod.contains('B') && rod.contains('R') && rod.contains('G'))
            {
                count++;
            }
        }
        return count;
    }
}