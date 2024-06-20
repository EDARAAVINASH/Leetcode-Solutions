class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       HashMap<Character,Integer> h=new HashMap();
        for(int i=0;i<magazine.length();i++)
            h.put(magazine.charAt(i),h.getOrDefault(magazine.charAt(i),0)+1);
        
        for(int i=0;i<ransomNote.length();i++)
        {
            if(h.get(ransomNote.charAt(i))==null||h.get(ransomNote.charAt(i))<=0)
                return false;
            else
               h.put(ransomNote.charAt(i),h.get(ransomNote.charAt(i))-1) ;
        }
        return true;
    }
}