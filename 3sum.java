class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length-2 && nums[i]<=0;i++){
            int left=i+1,right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum<0) 
                {
                    left++;
                    
                }
                else if(sum>0)
                {
                    right--;
                    
                }
                else{
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    res.add(temp);
                    while( left<nums.length-1 && nums[left]==nums[left+1] )
                        left++;
                    while( right>0 && nums[right]==nums[right-1])
                        right--;
                    left++;
                    right--;
                }
            }
            int k=i+1;
            while(nums[i]==nums[k] && k<nums.length-1){
                k++;
            }
            i=k-1;
        }
        
        return res;
    }
}
