class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for (int r = 0; r < accounts.length; r++) {
            int sum = 0;

            for (int num : accounts[r]) {
                sum = sum + num;
            }

            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1},
            {4, 5, 6}
        };

        int result = obj.maximumWealth(accounts);

        System.out.println("Maximum Wealth = " + result);
    }
}