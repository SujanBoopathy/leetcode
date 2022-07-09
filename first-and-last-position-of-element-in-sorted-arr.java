class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=-1,end=-1,loc=-1;
        int left=0,right=nums.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                loc=mid;
                break;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
         
            }
        }
        int a[]=new int[2];
        if(loc==-1){
            a[0]=-1;
            a[1]=-1;
            return a;
        }
       
        int temp=loc-1;
        while(temp>=0 && nums[loc]==nums[temp]){
            temp--;
        }
        start=temp+1;
        temp=loc+1;
        while(temp<nums.length && nums[loc]==nums[temp]){
            temp++;
        }
        end=temp-1;
        a[0]=start;
        a[1]=end;
        return a;
    }
}
