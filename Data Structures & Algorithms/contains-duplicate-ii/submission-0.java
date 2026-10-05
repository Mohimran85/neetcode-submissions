class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> box = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i>k){
                box.remove(nums[i-k -1]);
            }
            if (box.contains(nums[i])){
                return true;
            }
            box.add(nums[i]);
        }
        return false;
    }
}