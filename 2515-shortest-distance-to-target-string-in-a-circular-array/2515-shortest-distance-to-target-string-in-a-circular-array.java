class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        
        if(words[startIndex].equals(target)){
            return 0;
        }

        int len = words.length;

        for(int i = 1; i <= len; i++){
            
            if(words[(startIndex - i + len) % len].equals(target)){
                return i;
            }
            else if(words[(startIndex + i) % len].equals(target)){
                return i;
            }
        }

        return -1;
    }
}