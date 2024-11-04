class Solution {
    public String findDifferentBinaryString(String[] nums) {
        String s="";
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            char ch=nums[i].charAt(i);
            if(ch=='0')  s=s+"1";
            else
                s=s+"0";
        }
        return s;
    }
}