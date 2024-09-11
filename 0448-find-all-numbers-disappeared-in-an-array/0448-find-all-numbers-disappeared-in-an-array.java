class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        //I used inplace modification
        //logic yehi hai-jese 5,6 appear nhi hue hai aur ye number 4,5 index pr hote sorted array ke according
        //toh mene sirf jo number present the array me unki index wali value ko negative marks 
        //jese nums[5]=8 hai toh index=8-1=7 toh nums[7]=-nums[7] here nums[7]=-1
        //kar diya jisse sare number negative hogaye bas index=4,5 wale number positive rahe
        //aur last me i+1 ko result me add kar diya means 5,6 ko result me add kar diya
        
        //we didnt use any extra space like hashmap,hashset
     /*   List<Integer> result=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)
        {
            int index=Math.abs(nums[i])-1;
            
            nums[index]=Math.abs(nums[index])*(-1);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
                result.add(i+1);
        }
        return result;*/
        
        
        //using hashset
        List<Integer> result=new ArrayList<>();
        HashSet<Integer>hs=new HashSet<>();
        for(int num:nums)
        {
            hs.add(num);
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(hs.contains(i)==false)
                result.add(i);
        }
        return result;
    }
}