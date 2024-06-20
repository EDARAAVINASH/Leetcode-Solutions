class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] rotatedNums = new int[n];
        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            rotatedNums[newIndex] = nums[i];
        }
        System.arraycopy(rotatedNums, 0, nums, 0, n);
    }
}
