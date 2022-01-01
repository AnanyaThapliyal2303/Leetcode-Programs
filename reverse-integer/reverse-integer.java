class Solution {
    public int reverse(int x) {
        int signMultiplier = 1;
        if (x < 0) {
            signMultiplier = -1;
            x = signMultiplier * x;
        }

        long res = 0;
        while (x > 0) {
            // Add the current digit into result
            res = res * 10 + x % 10;

            // Check if the result is within MaxInt32 and MinInt32 bounds
            if ((signMultiplier * res >= Integer.MAX_VALUE) || (signMultiplier * res <= Integer.MIN_VALUE)) {
                return 0;
            }
            x = x / 10;
        }
        // Restore to original sign of number (+ or -)
        return (int)(signMultiplier * res);

    }
}