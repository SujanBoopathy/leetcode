class Solution {
    public boolean digitCount(String num) {
        int count[]=new int[10];
        
        for(int i=0;i<num.length();i++){
            count[Integer.parseInt(""+num.charAt(i))]++;
        }
        for(int i=0;i<num.length();i++){
            if(count[i]==Integer.parseInt(""+num.charAt(i)))
                continue;
            else
                return false;
        }
        return true;
    }
}
