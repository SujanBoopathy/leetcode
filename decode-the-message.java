class Solution {
    public String decodeMessage(String key, String message) {
        char alphabet[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Map<Character,Integer> mp=new HashMap<>();
        
        char keys[]=new char[26];
        int index=0;
        for(int i=0;i<key.length();i++){
            if(key.charAt(i)!=' ' && index<26){
                if(!mp.containsKey(key.charAt(i))){
                    keys[index]=key.charAt(i);
                    index++;
                    mp.put(key.charAt(i),1);
                }
            }
        }
        for(int i=0;i<message.length();i++){
            
        }
        return res;
        
    }
}
