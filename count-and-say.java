class Solution {
    public String updateString(String s){
        Map<Character,Integer> mp=new HashMap<>();
        List<Character> lst=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            }
            else{
                mp.put(s.charAt(i),1);
                lst.add(s.charAt(i));
            }
        }
        String res="";
        for(int i=0;i<lst.size();i++){
            res+=Integer.toString(mp.get(lst.get(i)))+lst.get(i);
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
