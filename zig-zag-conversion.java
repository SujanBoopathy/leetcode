class Solution {
    public String convert(String s, int numRows) {
       
        String res="";
        int step=2*numRows-2;
        for(int i=0;i<numRows;i++){
            for(int j=i;j<s.length();j+=step){
                res+=s.charAt(j);
                if(i!=0 && i!=numRows-1 && j+step-2*i<s.length()){
                    res+=s.charAt(j+step-2*i);
                }
            }
        }
        return res;
    }
}
