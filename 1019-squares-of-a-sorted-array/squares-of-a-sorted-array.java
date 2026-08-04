class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];

        int head=0;
        int tail=n-1;

        for(int i=n-1; i>=0; i--){
            if(Math.abs(nums[head])>Math.abs(nums[tail])){
                res[i]=nums[head]*nums[head];
                head++;
            }
            else{
                res[i]=nums[tail]*nums[tail];
                tail--;
            }
        }
        return res;
    }
}