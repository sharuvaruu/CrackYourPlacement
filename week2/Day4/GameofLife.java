class Solution {
    int n=0;
    int m=0;
    public void gameOfLife(int[][] board) {
       n=board.length;
        m=board[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                int count1s=getNeighbours(board,i,j);

                if(board[i][j]==1 && count1s<2)board[i][j]=-1;
                else if(board[i][j]==1 && count1s>3)board[i][j]=-1;
                else if(board[i][j]==0 && count1s==3)board[i][j]=2;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if(board[i][j]==-1)board[i][j]=0;
                else if(board[i][j]==2)board[i][j]=1;
    
            }
        }
    }
    public int getNeighbours(int[][] board,int row,int col){
        int count=0;
        for(int i=-1;i<=1;i++){
            for(int j=-1;j<=1;j++){
                if(i==0&&j==0)continue;
                if(row+i>=0 && row+i<n && col+j>=0 && col+j<m && (board[row+i][col+j]==1 || board[row+i][col+j]==-1))
                    count++;
            }
        }
        return count;
    }

}