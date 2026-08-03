class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int countConsecutive = 0;
        int count = 0;

        for(int num : nums){

            if(num == 1){
                count++;
                countConsecutive = Math.max(count, countConsecutive);
            }
            else{
                count=0;
            }
        }
        return countConsecutive;
    }
}