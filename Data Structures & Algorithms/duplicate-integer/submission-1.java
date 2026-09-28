class Solution {
    public boolean hasDuplicate(int[] nums) {
     HashSet<Integer> box =new HashSet<>();

     for(int num :nums){
        if (box.contains(num)){
            return true;
        }
        box.add(num);
     }
     return false;
    }
}