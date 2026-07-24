class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        String sortedS = sortString(s);
        String sortedT = sortString(t);

        return sortedS.equals(sortedT);
    }

    private String sortString(String a) {
        char[] chars = a.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}