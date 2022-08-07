class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        for(String word : words ){
            int flag=0;
            for(int i=0;i<word.length() && i<s.length();i++){
                if(s.charAt(i)!=word.charAt(i)){
                    flag=1;
                }
            }
            if(flag!=1){
                count++;
                
            }
        }
        return count;
    }
}
