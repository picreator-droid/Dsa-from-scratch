class Solution {
    public int missingNumber(int[] nums) {
        // int n=nums.length;
        // int expSum = n*(n+1)/2;
        // int currSum = 0;
        // for(int i=0;i<n;i++){
        //     currSum+=nums[i];
        // }
        // int result = expSum-currSum;
        // return result;

        int n=nums.length;
        int x=n;
        for(int i=0; i<n; i++){
            x=x^nums[i]^i;
        }
        return x;
    }
}