class Solution {
    public boolean isAnagram(String s, String t) {
     int slen1 = s.length();
     int tlen2 = t.length();
     boolean ans = true;
     if( slen1  != tlen2) return false;
     else{
       char [] arr1=s.toCharArray();
        Arrays.sort(arr1);
        char [] arr2=t.toCharArray();
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
     }
     
    }   
}
