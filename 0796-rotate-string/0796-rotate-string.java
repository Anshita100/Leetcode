class Solution {
    public boolean rotateString(String A, String B) {
        //TC-O(n2),SC-O(N)  1ms
   /*     if (A.length() != B.length()) return false;
        
        for (int i = 0; i < A.length(); i++) {
            String rotated = A.substring(i) + A.substring(0, i);
            if (rotated.equals(B)) {
                return true;
            }
        }
        
        return false;*/
        
        if (A.length() != B.length()) return false;
        
        // Concatenate A with itself and check if B is a substring of A + A
        return (A + A).contains(B);
    }
}