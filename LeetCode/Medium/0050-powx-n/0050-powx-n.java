class Solution {
    public double myPow(double x, int n) {
        long N = n; 
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double result = 1.0;
        while (N > 0) {
            if (N % 2 == 1) {   
                result *= x;
            }
            x *= x;             
            N /= 2;             
        }
        return result;
    }
}
// ### Walkthrough — `x=2, n=10`
// N=10, x=2,  result=1
// N=5,  x=4,  result=1   (10 even)
// N=2,  x=16, result=4   (5 odd  → result*=4)
// N=1,  x=256,result=4   (2 even)
// N=0,  result=4*256=1024 (1 odd → result*=256)
// return 1024 ✓