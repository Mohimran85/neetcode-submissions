class Solution {
    public int[] replaceElements(int[] arr) {
        int length = arr.length-1;
        int max =-1;
        for(int i= length;i>=0;i--){
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max,temp);
        }
        return arr;
    }
}