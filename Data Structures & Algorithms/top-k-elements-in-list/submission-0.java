class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> box = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(box.containsKey(nums[i])){
                box.put(nums[i],box.get(nums[i])+1);
            }
            else{
                box.put(nums[i],1);
            }
        }
        List<Map.Entry<Integer,Integer>> list =new ArrayList<>(box.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());
        int [] arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = list.get(i).getKey();
        }
        return arr;
    }
}
