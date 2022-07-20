class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> colSet[]=new HashSet[9];
        Set<Character> rowSet[]=new HashSet[9];
        Set<Character> boxSet[]=new HashSet[9];
        
        for(int i=0;i<9;i++){
            rowSet[i]=new HashSet<Character>();
            colSet[i]=new HashSet<Character>();
            boxSet[i]=new HashSet<Character>();
        }
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] != '.'){
                    int k=(i/3)*3+j/3;
                if((rowSet[i].contains(board[i][j])) || colSet[i].contains(board[i][j]) || boxSet[i].contains(board[i][j])){
                    return false;
                }
                rowSet[i].add(board[i][j]);
                colSet[i].add(board[i][j]);
                boxSet[i].add(board[i][j]);
                }
            }
        }
        return true;
        
    }
}
