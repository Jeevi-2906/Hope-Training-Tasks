class Solution {
    public int maximumWealth(int[][] accounts) {
        int row = accounts.length;
        int col = accounts[0].length;
        int sum = 0, max=Integer.MIN_VALUE;
        for(int i=0;i<row;i++)
        {
            sum = 0;
            for(int j=0;j<col;j++)
            {
                sum += accounts[i][j];
            }
            max = Math.max(sum,max);
        }

        return max;
    }
}
