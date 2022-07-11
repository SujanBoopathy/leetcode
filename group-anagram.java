class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();
        
        Map<String,ArrayList<String>> mp=new HashMap<>();
        for(String s:strs){
            char c[]=new char[26];
            for(int i=0;i<s.length();i++){
                c[s.charAt(i)-'a']++;
            }
            String temp=new String(c);
            if(mp.containsKey(temp)){
                mp.get(temp).add(s);
            }
            else{
                ArrayList<String> ls=new ArrayList<>();
                ls.add(s);
                mp.put(temp,ls);
            }
        }
        result.addAll(mp.values());
        return result;
    }
}
