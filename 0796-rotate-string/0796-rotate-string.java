class Solution {
    public boolean rotateString(String A, String B) {
        //TC-O(n2),SC-O(N)
        if (A.length() != B.length()) return false;
        
        for (int i = 0; i < A.length(); i++) {
            String rotated = A.substring(i) + A.substring(0, i);
            if (rotated.equals(B)) {
                return true;
            }
        }
        
        return false;
    }
}