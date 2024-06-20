import java.util.Map.Entry;
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
      TreeMap<Integer,String> map=new TreeMap(new MyComparator());
      String[] al=new String[names.length];
      int x=0;
      for(int i=0;i<heights.length;i++)
      {
            map.put(heights[i],names[i]);
      } 
      for(Entry<Integer,String> ent:map.entrySet())
      {
            al[x++]=ent.getValue();
      } 
      return al;
    }
}
class MyComparator implements Comparator<Integer>
{
    public int compare(Integer a,Integer b)
    {
        return b.compareTo(a);
    }
}