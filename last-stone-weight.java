class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1)
            return stones[0];
        while(true){
            int max=stones[0],smax=0,mi=0,mj=0;
            for(int i=1;i<stones.length;i++){
                if(max<stones[i]){
                    smax=max;
                    mj=mi;
                    max=stones[i];
                    mi=i;
                }
            }
            if(smax==max){
                stones[mi]=0;
                stones[mj]=0;
            }
            else{
                stones[mi]=stones[mi]-stones[mj];
                stones[mj]=0;
            }
            int flag=0;
            
            if(flag<=1)
                break;
        }
        for(int i=0;i<stones.length;i++){
            if(stones[i]!=0)
                return stones[i];
        }
        return 0;
    }
}
