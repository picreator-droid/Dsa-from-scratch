class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set= new HashSet<>(); 
        for(int i: nums){
            if(!set.add(i)){  // if i was already present then set.add(i) will return false but after applying NOT (!)
                                // (!set.add(i)) this will reverse the result. 
                return true;
            }
        }
        return false;
    }
}