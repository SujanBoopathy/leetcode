class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
                  
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){ 
            int a=i,b=i+1,c=i+2;
            while(c<nums.length){
                int temp=nums[a]+nums[b]+nums[c];
                if(temp==0){
                    List<Integer> lst=new ArrayList<>();
                    if(nums[a]!=0)
                        lst.add(nums[a]);
                    
                    if(nums[b]!=0) 
                        lst.add(nums[b]);
                    
                    if(nums[c]!=0)
                        lst.add(nums[c]);
                    if(nums[a]==0)
                        lst.add(nums[a]);
                    if(nums[b]==0)
                        lst.add(nums[b]);
                    if(nums[c]==0)
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
