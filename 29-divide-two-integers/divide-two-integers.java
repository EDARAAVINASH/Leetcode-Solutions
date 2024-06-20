class Solution {
    public int divide(int dividend, int divisor) {
        // Handle special case where dividend equals divisor
        if (dividend == divisor) {
            return 1; // Assuming returning 1 is correct for this edge case
        }
        
        // Determine the sign of the result
        boolean sign = (dividend >= 0) == (divisor >= 0);
        
        // Convert dividend and divisor to positive long values to handle overflow
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        long q = 0;
        
        // Perform division using bit manipulation
        while (n >= d) {
            int count = 0;
            long dShifted = d;
            while (n >= (dShifted << 1)) {
                dShifted <<= 1;
                count++;
            }
            q += (1L << count); // Use 1L to ensure it's treated as a long
            n -= dShifted;
        }
        
        // Handle overflow conditions
        if (q > Integer.MAX_VALUE) {
            return sign ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        
        // Apply sign and cast the result to int
        return sign ? (int) q : (int) -q;
    }
}
