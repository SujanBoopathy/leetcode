class Solution {
    public boolean wordPattern(String pattern, String s) {
        List<String> lst=new ArrayList<String>();
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                lst.add(res);
                res="";
            }
            else{
                res+=s.charAt(i);
            }
        }
        lst.add(res);
        Map<Character,String> mp=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            if(mp.containsKey(pattern.charAt(i))){
                continue;
            }
            else{
                mp.put(pattern.charAt(i),lst.get(i));
            }
        }
        for(int i=0;i<pattern.length();i++){
            if(mp.containsKey(pattern.charAt(i)) && mp.get(pattern.charAt(i)).equals(lst.get(i))){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
