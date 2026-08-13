class Solution {
    public int maxArea(int[] height) {
       int left=0;
       int right=height.length-1;
       int max_weight=0;

       while(left<right){
        int min_height= Math.min(height[left], height[right]);
        int weight= min_height * (right-left);
        max_weight=Math.max(weight, max_weight);

        while(left<right && height[left]<=min_height){
            left++;
        }
        while(left<right && height[right]<=min_height){
            right--;
        }
       }
       return max_weight;
    }
}