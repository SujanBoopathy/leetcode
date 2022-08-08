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
            int min=100;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<min && nums[i]>0){
                    min=nums[i];
                }
            }
            for(int i=0;i<nums.length;i++){
                if(nums[i]>0){
                    nums[i]-=min;
                }
            }
            count++;
        }
        return count;
    }
}
