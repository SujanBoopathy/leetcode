class Solution {
    public String convert(String s, int numRows) {
       
        String res="";
        int step=2*numRows-2;
        for(int i=0;i<numRows;i++){
            for(int j=i;j<s.length();j+=step){
                res+=s.charAt(j);
                
            }
        }
        return res;
    }
}
