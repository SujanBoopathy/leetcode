class Solution {
    public String reverseString(String s){
        String  tempString="";
        for(int i=s.length()-1;i>=0;i--){
            tempString+=s.charAt(i);
        }
        return tempString;
    }
    public String reverseStr(String s, int k) {
        String res="";
        for(int i=0;i<s.length();i+=(2*k)){
            if(i+(2*k)<s.length()){
                res+=reverseString(s.substring(i,i+k))+s.substring(i+k,i+(2*k));
            }
            else if(i+k<=s.length()){
                res+=reverseString(s.substring(i,i+k))+s.substring(i+k,s.length());
            }
            else if(i+k>s.length()){
                res+=reverseString(s.substring(i,s.length()));
            }
            
        }
        return res;
    }
}
