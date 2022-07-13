class Solution {
    public int countAsterisks(String s) {
        int flag=0,count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|'){
                if(flag==1)
                    flag=0;
                else
                    flag=1;
            }
            
        }
        return count;
    }
}
