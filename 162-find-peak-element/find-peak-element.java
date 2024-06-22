class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0, end = nums.length - 1;
        
        while (start < end) {
            int mid = (start + end) / 2;
            
            // Compare mid element with its next element
            if (nums[mid] > nums[mid + 1]) {
                // We are in the decreasing part of the array
                // so the peak element is on the left side (including mid)
                end = mid;
            } else {
                // We are in the increasing part of the array
                // so the peak element is on the right side (excluding mid)
                start = mid + 1;
            }
        }
        
        // At the end, start and end will converge to the peak element
        return start;
    }
}
