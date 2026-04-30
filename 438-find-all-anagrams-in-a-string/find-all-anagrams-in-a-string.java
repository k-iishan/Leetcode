class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int len = p.length();

        char[] pArr = p.toCharArray();
        Arrays.sort(pArr);

        for (int i = 0; i <= s.length() - len; i++) {
            String sub = s.substring(i, i + len); 
            char[] sArr = sub.toCharArray();
            Arrays.sort(sArr);

            if (Arrays.equals(pArr, sArr)) {
                list.add(i);
            }
        }

        return list;
    }
}