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
        return true;
        
    }
}
