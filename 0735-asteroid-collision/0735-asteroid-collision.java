class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> s = new Stack<>();
        int sum = 0;
        
        for (int num : a) {
            // Handle collisions only when top is +ve and current is -ve
            while (!s.isEmpty() && num < 0 && s.peek() > 0) {
                sum = num + s.peek();
                
                if (sum == 0) {          // both same size, destroy both
                    s.pop();
                    num = 0;            // current also destroyed
                    break;
                } 
                else if (sum < 0) {     // current asteroid is bigger (left-moving)
                    s.pop();            // remove smaller right-moving
                    // keep checking next asteroid in stack
                } 
                else {                  // stack top is bigger (right-moving)
                    num = 0;            // current asteroid destroyed
                    break;
                }
            }
            
            if (num != 0) {             // if current asteroid still alive
                s.push(num);
            }
        }
        
        // convert stack to array (final surviving asteroids)
        int[] res = new int[s.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = s.pop();
        }
        return res;
    }
}
