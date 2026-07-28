class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) { //search from each index to find 1
            if ((n & (1 << i)) != 0) { //if 1 is found then add +1 to count
                count++;
            }
        }
        return count;
    }
}