class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
            int nums1p = 0;
            int nums2p = 0;
            int [] arr = new int[m+n];
            while(nums1p < m){
                arr[nums1p] = nums1[nums1p];
                nums1p++;
            }
             while(nums2p < n){
                arr[nums1p] = nums2[nums2p];
                nums1p++;
                nums2p++;
            }
            Arrays.sort(arr);

            for (int i = 0; i < arr.length; i++) {
            nums1[i] = arr[i];
            }
    }
}