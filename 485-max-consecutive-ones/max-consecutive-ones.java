class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int countConsecutive = 0;
        int count = 0;

        for(int num : nums){

            if(num == 1){
                count++;
                
            }
            else{
                if(count > countConsecutive){
                    countConsecutive = count;
                }
                count=0;
            }
        }
        return Math.max(countConsecutive, count);
    }
}