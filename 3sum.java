class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            while(j<nums.length-1){
                int k=j+1;
                while(k<nums.length){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        if(!res.contains(temp))
                            res.add(temp);
                    }
                    k++;
                }
                j++;
            }
        }
        return res;
    }
}
