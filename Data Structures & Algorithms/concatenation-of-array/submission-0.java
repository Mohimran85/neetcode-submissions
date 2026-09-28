class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] result = Arrays.copyOf(nums,2*nums.length);
        for(int i=0;i<nums.length;i++){
            result[i+nums.length] =nums[i];
        }
        return result;
    }
}