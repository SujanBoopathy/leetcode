class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1)
            return stones[0];
        if(stones.length==2){
            if(stones[0]==stones[1])
                return 0;
            else if(stones[0]>stones[1])
                return stones[0]-stones[1];
            else
                return stones[1]-stones[0];
        }
        while(true){
            int max=0,smax=0,maxi=-1;
            for(int i=0;i<stones.length;i++){
                if(max<stones[i]){
                    smax=max;
                    max=i;
                }
            }
            if(stones[max]==stones[smax]){
                stones[max]=0;
                stones[smax]=0;
            }
            else{
                stones[max]=stones[max]-stones[smax];
                stones[smax]=0;
            }
            
            int flag=0;
            for(int i=0;i<stones.length;i++){
                if(stones[i]>0)
                    flag++;
            }
            if(flag<=1)
                break;
        }
        for(int i=0;i<stones.length;i++){
            if(stones[i]>0)
                return stones[i];
        }
        return 0;
    }
}
