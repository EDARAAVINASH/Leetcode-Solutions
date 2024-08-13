public class Solution {
    public int reverse(int x) {
        int sum = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;

            // Check for overflow
            if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            // Check for underflow
            if (sum < Integer.MIN_VALUE / 10 || (sum == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            sum = sum * 10 + pop;
        }
        return sum;
    }
}
