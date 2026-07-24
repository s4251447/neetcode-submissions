class Solution {
    public boolean isPalindrome(String s) {
        /*
        1. reverse whole string
        2. make all char lowercase
        3. ignore alphanumericc characters
        4. remove spaces in the string
        */

        s = s.toLowerCase();
        
        s = s.replaceAll("[^a-z0-9]", ""); 

        StringBuilder reverseS = new StringBuilder(s);
        reverseS.reverse();
        String reversed = reverseS.toString();

        return s.equals(reversed);
    }
}
