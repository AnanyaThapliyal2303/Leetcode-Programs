class Solution {
    public int maximumWealth(int[][] accounts) {
        int i=0,j=0,max=0;
        int sum;
        for(i=0;i<accounts.length;i++)
        {
            sum=0;
            for(j=0;j<accounts[0].length;j++)
                sum=sum+accounts[i][j];
            if(sum>max)
                max=sum;
        }
        return max;
    }
}