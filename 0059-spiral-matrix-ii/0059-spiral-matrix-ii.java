class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n] ;
        int rowb = 0 , rowe = n-1 ;
        int colb = 0 , cole = n-1 ;
        int count = 1 ;
        while(rowb <= rowe || colb <= cole){
            for(int i = rowb ; i <= cole ; i++){
                ans[rowb][i] = count++;
            }
            rowb++;
            for(int i =  rowb ; i <= rowe ; i++){
                ans[i][cole] = count++;
            }
            cole-- ;
            for(int i = cole ; i >= colb ; i--){
                ans[rowe][i] = count++;
            }
            rowe-- ;;
            for(int i = rowe ; i >=  rowb ; i--){
                ans[i][colb] = count++;
            }
            colb++;
        }
        return ans ;
    }
}