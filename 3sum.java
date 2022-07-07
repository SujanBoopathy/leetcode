class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
                  
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){ 
            int a=i,b=i+1,c=i+2;
            while(c<nums.length){
                int temp=nums[a]+nums[b]+nums[c];
                if(temp==0){
                    List<Integer> lst=new ArrayList<>();
                    lst.add(nums[a]);
                    lst.add(nums[b]);
                    lst.add(nums[c]);
                    if(!res.contains(lst)){
                        res.add(lst);
                    }
                }
                b++;
                c++;
            }
        }
        return res;
    }
}
