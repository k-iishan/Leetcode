class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length ;
        int[] dp = new int[len+1] ;
        Arrays.fill(dp , -1);
        return mccs(len ,cost ,dp);
      
    }
    int mccs(int end,int[] cost ,int[] dp){
      if(end <=1 ){
        dp[end] = 0 ;
        return 0 ;
      }
      if(dp[end] != -1){
        return dp[end];
      }
      int one  = cost[end-1] + mccs(end-1 , cost , dp);
      int two  =cost[end-2] + mccs(end-2 , cost ,dp);
      dp[end] = Math.min(one ,two);
      return dp[end];
    }
}