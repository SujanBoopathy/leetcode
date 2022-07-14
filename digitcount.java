class Solution {
    public boolean digitCount(String num) {
        int count[]=new int[num.length()];
        
        for(int i=0;i<num.length();i++){
            count[Integer.parseInt(s.charAt(i))]++;
        }
        for(int i=0;i<num.length();i++){
            if(count[i]==Integer.parseInt(s.charAt(i)))
                continue;
            else
                return false;
        }
        return true;
    }
}
