class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=-1,end=-1,loc=0;
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
        int temp=loc;
        while(nums[loc]!=nums[temp]){
            temp--;
        }
        if(temp!=loc)
           start=temp++;
        temp=loc;
        while(nums[loc]!=nums[temp]){
            temp++;
        }
        end=temp--;
        a[0]=start;
        a[1]=end;
        return a;
    }
}
