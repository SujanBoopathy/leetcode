class Solution {
    public int percentageLetter(String s, char letter) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==letter){
                count++;
            }
        }
        int res=Math.floor(Integer.parseInt((count/s.length()))*100);
        return res;
    }
}
