class Solution {
    public String decodeMessage(String key, String message) {
        char a[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Map<Character,Integer> mp=new HashMap<>();
        int index=0;
        for(int i=0;i<key.length();i++){
            if(key.charAt(i)!=' ' && index<26){
                if(!mp.containsKey(key.charAt(i))){
                    mp.put(key.charAt(i),index);
                    index++;
                }
            }
        }
        String res="";
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)!=' '){
                res+=a[mp.get(message.charAt(i))];
            }
            else{
                res+=" ";
            }
        }
        return res;
        
    }
}
