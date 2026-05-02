class Solution {
    public int rotatedDigits(int n) {
        int count = 0 ;
        for(int i = 0 ; i <= n  ; i++){
          String a = String.valueOf(i);
          if(a.indexOf('3') == -1 && a.indexOf('4') == -1 && a.indexOf('7') == -1){
            if(a.indexOf('2') != -1 || a.indexOf('5') != -1 || a.indexOf('6') != -1 || a.indexOf('9') != -1 ){
                count++ ;
            }
          }
        } 
        return count ;
    }
}