class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        Set<Integer> s=new HashSet<>();
        for(int i:candyType)
            s.add(i);
        if((n/2)<=s.size()){
            return n/2;
        }        
        else{
            return s.size();
        }
        
    }
}
