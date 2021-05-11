class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int []left_sum=new int[k+1];
        left_sum[0]=0;
        int []right_sum=new int[k+1];
        right_sum[0]=0;
        int maxm=0;
        int i=1,n=cardPoints.length;
        for(i=1;i<=k;i++)
        {
            left_sum[i]=cardPoints[i-1]+left_sum[i-1];
            right_sum[i]=cardPoints[n-i]+right_sum[i-1];
        }

        for(i=0;i<=k;i++)
        {
            maxm=Math.max(maxm,left_sum[i]+right_sum[k-i]);
        }
        return maxm;
    }
}
