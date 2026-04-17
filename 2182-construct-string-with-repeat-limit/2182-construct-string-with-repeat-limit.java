class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] freq = new int[26];
        
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        StringBuilder result = new StringBuilder();
        
        int i = 25; 
        
        while (i >= 0) {
            if (freq[i] == 0) {
                i--;
                continue;
            }
            
            int use = Math.min(freq[i], repeatLimit);

            for (int j = 0; j < use; j++) {
                result.append((char)(i + 'a'));
            }
            
            freq[i] -= use;

            if (freq[i] > 0) {
                int j = i - 1;

                while (j >= 0 && freq[j] == 0) {
                    j--;
                }
                
                if (j < 0) break; 
                
                result.append((char)(j + 'a'));
                freq[j]--;
            }
        }
        
        return result.toString();
    }
}