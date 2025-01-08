class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] arr : accounts) {
            int total = 0;
            for (int i : arr) {
                total += i;
            }
            max = Math.max(max, total);
        }
        return max;
    }
}