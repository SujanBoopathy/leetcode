class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue()%2!=0)
                return false;
        }
        return true;
    }
}
