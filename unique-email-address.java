class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> st=new HashSet<>();
        for(String s:emails){
            String temp="";
            int flag=0,flag1=1;
            for(int i=0;i<s.length();i++){
                if(flag==0 && s.charAt(i)!='+'){
                    temp+=s.charAt(i);
                }
                else if(flag==0 && s.charAt(i)=='+'){
                    flag=1;
                }                
                else if(flag==1 && s.charAt(i)=='@'){
                    flag1=1;
                    temp+=s.charAt(i);
                }
                else if(flag1==1){
                    temp+=s.charAt(i);
                }
            }
            st.add(temp);
        }
        return st.size();
    }
}
