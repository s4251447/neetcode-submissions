class Solution {
    public int climbStairs(int n) {
        int x, y;
        x = 1;
        y = 1;

        for (int i = 1; i < n; i++) {
            int temp = x;
            x = x + y;
            y = temp;
        }
        return x;
    }
}
