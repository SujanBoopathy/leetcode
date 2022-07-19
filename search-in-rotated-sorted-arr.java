class Solution {
    public int search(int[] nums, int target) {
        int min=0;
        for(int i=1;i<nums.length;i++){
            if(nums[min]>nums[i])
                min=i;
        }
        
        return min;
    }
}
