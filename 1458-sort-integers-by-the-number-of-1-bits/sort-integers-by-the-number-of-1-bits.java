import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

class Solution {
    public int[] sortByBits(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        // Add elements to the list
        for (int num : arr) {
            list.add(num);
        }
        
        // Sort the list based on the number of set bits
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int countA = countSetBits(a);
                int countB = countSetBits(b);
                if (countA != countB) {
                    return countA - countB;
                } else {
                    return a - b; // If set bits are equal, sort by value
                }
            }
        });
        
        // Convert the sorted list to an array
        int[] out = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            out[i] = list.get(i);
        }
        
        return out;
    }
    
    // Helper method to count the number of set bits in a number
    private int countSetBits(int num) {
        int count = 0;
        while (num > 0) {
            num &= (num - 1); // Brian Kernighan's Algorithm
            count++;
        }
        return count;
    }
}
