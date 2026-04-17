class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0 ;
        for(int n : costs){
            if(coins- n >= 0){
                coins -= n ;
                count++ ;
            }else{
                break ;
            }
        }
        return count ;
    }
}