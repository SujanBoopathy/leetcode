class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=nums.length-1;i>=(nums.length/2);i--){
            if(nums[i]==nums[i-1]){
                sum+=nums[i];
                i--;
            }
            else{
                sum+=nums[i];
            }
        }
        return sum;
    }
}
