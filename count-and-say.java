class Solution {
    public String updateString(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            int j=i,count=1;
            while(j<s.length()-1 && s.charAt(j)==s.charAt(j+1)){
                j++;
                count++;
            }
            res+=Integer.toString(count)+s.charAt(i);
            i=j;
        }
        return res;
    }
    public String countAndSay(int n) {
        String s="1";
        if(n==1)
            return s;
        for(int i=1;i<n;i++){
            s=updateString(s);
        }
        return s;
    }
}
