class Solution {
    public String updateString(String s){
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            }
            else{
                mp.put(s.charAt(i),1);
            }
        }
        String res="";
        for(Map.Entry<Character,Integer> m:mp.entrySet()){
            res+=m.getKey();
        }
        return res;
    }
    public String countAndSay(int n) {
        String s="1";
        for(int i=0;i<n;i++){
            s=updateString(s);
        }
        return s;
    }
}
