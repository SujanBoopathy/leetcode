class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int target[]=new int[nums.length];
        int visit[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            target[index[i]]=nums[i];
        }
        return target;
    }
}
