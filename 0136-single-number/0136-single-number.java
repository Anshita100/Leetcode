class Solution {
    public int singleNumber(int[] nums) {
      //  if we perform the XOR of all the numbers of the array elements, we will be left with a single number
        int xor=0;
        for(int a: nums)
        {
            xor=xor^a;
        }
        return xor;
    }
}