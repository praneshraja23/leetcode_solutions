class Solution {
    public double myPow(double x, int n) {
        long pow = (n < 0) ? -(long)n : (long)n; // cast to long to avoid overflow
        x = (n < 0) ? (1 / x) : x;
        return calPow(x, pow);
    }

    public double calPow(double x, long pow) {
        if (pow == 0) {
            return 1;
        }
        if (pow == 1) {
            return x;
        }
        if (pow % 2 != 0) {
            return x * calPow(x, pow - 1);
        } else {
            return calPow(x * x, pow / 2);
        }
    }
}
