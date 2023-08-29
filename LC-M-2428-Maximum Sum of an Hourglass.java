class Solution {
    public int maxSum(int[][] grid) {
        int n = grid.length-3+1;
        int m = grid[0].length-3+1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                max=Math.max(max,getAns(grid,i,j));
            }
        }
        return max;
    }
    public int getAns(int[][] mat , int rowS,int colS){
        int ans=0;
        int col=1;
        int rowE=rowS+2;
        int colE=colS+2;
        for(int i=rowS;i<=rowE;i++){
            for(int j=colS;j<=colE;j++){
                if(col==2){
                    ans+=mat[i][j+1];
                    break;
                }
                else{
                    ans+=mat[i][j];
                }
                
            } 
            col++;  
        }
        return ans;

    }
}
