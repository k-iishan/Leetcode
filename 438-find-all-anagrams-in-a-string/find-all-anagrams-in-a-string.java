class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();

        if (s.length() < p.length()) return list;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int len = p.length();

        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;

            if (i >= len) {
                sCount[s.charAt(i - len) - 'a']--;
            }

            if (Arrays.equals(pCount, sCount)) {
                list.add(i - len + 1);
            }
        }

        return list;
    }
}