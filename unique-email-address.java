class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> st=new HashSet<>();
        for(String s:emails){
            String temp="";
            int host=0,local=0;
            for(int i=0;i<s.length();i++){
                if(local==0 && s.charAt(i)!='.' && s.charAt(i)!='+'){
                    temp+=s.charAt(i);
                }
                if(s.charAt(i)=='+' && local==0){
                    local=1;
                }
                if(local==1 && s.charAt(i)=='@'){
                    temp+=s.charAt(i);
                    host=1;
                }
                if(host==1){
                    temp+=s.charAt(i);
                }
            }
            st.add(temp);
        }
        return st.size();
    }
}
