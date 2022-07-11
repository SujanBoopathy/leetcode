class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        int status[]=new int[strs.length];
        for(int i=0;i<strs.length;i++)
            status[i]=1;
        for(int i=0;i<strs.length;i++){
            List<String> temp=new ArrayList<>();
            temp.add(strs[i]);
            int count[]=new int[26];
            for(int j=0;j<strs[i].length();j++){
                count[strs[i].charAt(j)-'a']++;
            }
                        
        }
        return res;
    }
}
