class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> in=new HashSet<>();
        //HashSet<String> ou=new HashSet<>();
       for(List<String> l:paths)
       {
            in.add(l.get(0));
       }
       for(List<String> l:paths)
       {
            if(!in.contains(l.get(1)))
            {
                return l.get(1);
            }
       }
        return "";
    }
}