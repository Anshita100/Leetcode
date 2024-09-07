class Solution {
    public int reverse(int n) {
        int rev = 0;
        
        while (n != 0) {
            int last = n % 10;
            
            try {
                rev = Math.multiplyExact(rev, 10); // Safely multiply by 10
                rev = Math.addExact(rev, last);    // Safely add the last digit
            } catch (ArithmeticException e) {
                // If overflow happens, return 0
                return 0;
            }
            
            n /= 10;
        }
        
        return rev;
    }
}
