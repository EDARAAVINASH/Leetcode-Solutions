import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<>();
        
        for (int j = 1; j <= numRows; j++) {
            int first = 1;
            List<Integer> l1 = new ArrayList<>();
            
            for (int i = 1; i < j; i++) { 
                l1.add(ans(j - 1, i - 1));
            }
            l1.add(first);
            
            l.add(l1);
        }
        
        return l;
    }
    
    public int ans(int n, int r) {
        double res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return (int) res;
    }
}
