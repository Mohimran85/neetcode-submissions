class Solution {
    public String mergeAlternately(String word1, String word2) {
        int wlen1 =0;
        int wlen2 =0;
        String result ="";
        while(wlen1 < word1.length() && wlen2 < word2.length()){
          result += word1.charAt(wlen1);
          wlen1++;
          result+=word2.charAt(wlen2);
          wlen2++;
        }
        if(wlen2 < word2.length()){
            for(int i=wlen2 ;i<word2.length();i++){
                result +=word2.charAt(i);
            }
        }
        else if(wlen1 <word1.length()){
            for(int i=wlen2 ;i<word1.length();i++){
                result +=word1.charAt(i);
            }
        }
        return result;
    } 
}