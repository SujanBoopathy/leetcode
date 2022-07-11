class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int left=0,right=nums.length-1,sum=0;
        while(left<right){
            if(nums[right]==nums[right-1]){
                sum+=nums[right];
                right-=2;
            }
            else{
                sum+=nums[left];
                left+=2;
            }
        }
        return sum;
    }
}
