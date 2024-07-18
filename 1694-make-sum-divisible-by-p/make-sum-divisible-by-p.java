class Solution {
    public int minSubarray(int[] nums, int p) {
        int mod = 0;
        for (int num : nums) {
            mod += num;
            mod %= p;
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        
        int preSum = 0;
        int ans = nums.length;
        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];
            preSum %= p;
            map.put(preSum, i);

            int wanted = (preSum - mod + p) % p;
            if (map.containsKey(wanted)) {
                ans = Math.min(ans, i - map.get(wanted));
            }
        }
        return ans == nums.length ? -1 : ans;
    }
}