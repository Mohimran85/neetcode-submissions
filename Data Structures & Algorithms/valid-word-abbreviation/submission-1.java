class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i =0;
        int j=0;
        while(j <abbr.length()){
            if(Character.isLetter(abbr.charAt(j))){
                if(i >= word.length() ||
    abbr.charAt(j) != word.charAt(i)){
                    return false;
                }
                else{
                    i++;
                    j++;
                }
            }
            else{
                if(abbr.charAt(j) == '0'){
                    return false;
                }
                int num =0;
                while (j< abbr.length() && Character.isDigit(abbr.charAt(j))){
                    num =num * 10 +(abbr.charAt(j) -'0') ;
                    j++;  
                }
                i += num;
                if(i > word.length()){
                    return false;
                }
                
            }
        }
        return i == word.length();
    }
}