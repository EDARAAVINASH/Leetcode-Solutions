class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int l = 0, r = 0;
        int n = fruits.length;
        int maxlen = 0;

        while (r < n) {
            map.put(fruits[r], r);

            if (map.size() > 2) {
                int minIndex = Integer.MAX_VALUE;
                for (int index : map.values()) {
                    minIndex = Math.min(minIndex, index);
                }
                l = minIndex + 1;
                map.remove(fruits[minIndex]);
            }

            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }

        return maxlen;
    }
}