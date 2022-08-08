class Solution {
    public boolean check(int[] nums){
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                return true;
            }
        }
        return false;
    }
    public int minimumOperations(int[] nums) {
        int count=0;
        while(check(nums)){
            int min=0,smin=0;
            for(int i=0;i<nums.length;i++){
                if(nums[min]>nums[i]){
                    smin=min;
                    min=i;
                }
            }
            for(int i=0;i<nums.length;i++){
                nums[i]-=nums[smin];
            }
            count++;
        }
        return count;
    }
    
}
