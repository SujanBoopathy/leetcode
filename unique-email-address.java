class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> st=new HashSet<>();
        for(String s:emails){
            String a[]=s.split("@");
            String local[]=a[0].split("\\+");
            st.add(local[0].replace(".","")+"@"+a[1]);
        }
        return st.size();
    }
}
