class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q=new PriorityQueue<Integer>();
        for(int i=0;i<stones.length;i++){
            q.add(stones[i]);
        }
        while(q.size()>1){
            int a=q.poll();
            int b=q.poll();
            if(a!=b)
                q.add(a-b);
        }        
        
        if(q.size()==1)
            return q.poll();
        else
            return 0;
    }
}
