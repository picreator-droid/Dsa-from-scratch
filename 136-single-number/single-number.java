class Solution {
    public int singleNumber(int[] nums) {
        int single = nums[0];
        
        if(nums.length == 0) return single;
        for(int i=1; i<nums.length; i++){
            single = single ^ nums[i];
        }
        return single;
    }
}