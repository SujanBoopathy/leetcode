class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] res=new int[grid.length-2][grid.length-2];
        
        for(int i=0;i<grid.length-2;i++){
            for(int j=0;j<grid.length-2;j++){
                // int largest=Integer.MIN_VALUE;
                for(int row=i;row<i+3;row++){
                    for(int col=j;col<j+3;col++){
                        if(grid[row][col]>res[i][j]){
                            res[i][j]=grid[row][col];
                        }
                    }
                }
            }
        }
        // return res;
        return res;
    }
}
