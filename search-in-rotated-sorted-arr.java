class Solution {
    public int search(int[] nums, int target) {
        int min=0;
        for(int i=1;i<nums.length;i++){
            if(nums[min]>nums[i])
                min=i;
        }
        int sorted[]=new int[nums.length];
        int j=0;
        for(int i=min;i<nums.length;i++){
            sorted[j]=nums[i];
            j++;
        }
        for(int i=0;i<min;i++){
            sorted[j]=nums[i];
            j++;
        }
        return min;
    }
}
