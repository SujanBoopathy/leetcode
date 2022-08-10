class Solution {
    public boolean compare(int[] a,int[] b){
        for(int i=0;i<26;i++){
            if(a[i]>b[i]){
                return false;
            }
        }
        return true;
    }
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int count[]=new int[26];
        String result="";
        for(int i=0;i<licensePlate.length();i++){
            if(licensePlate.charAt(i)>='a' && licensePlate.charAt(i)<='z'){
                count[licensePlate.charAt(i)-'a']++;
            }
            if(licensePlate.charAt(i)>='A' && licensePlate.charAt(i)<='Z'){
                count[licensePlate.charAt(i)-'A']++;
            }
        }
        for(String word:words){
            int count1[]=new int[26];
            for(int i=0;i<word.length();i++){
                if(word.charAt(i)>='a' && word.charAt(i)<='z'){
                    count1[word.charAt(i)-'a']++;
                }
                if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                    count1[word.charAt(i)-'A']++;
                }
            }
            if(compare(count,count1)){
                if(result.equals("")){
                    result=word;
                }
                else if(result.length()>word.length()){
                    result=word;
                }
            }
        }
        return result;
    }
}
