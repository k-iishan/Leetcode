class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int count = 0 , l = 0 , r = 0 ;
        for(char a : moves.toCharArray()){
            if(a == 'R'){
                r++ ;
            }
            else if(a == 'L'){
                l++ ;
            }
            else{
                count++ ;
            }

        }
        if(r > l){
            return r - l + count ;
        }
        return l - r + count ;
    }
}