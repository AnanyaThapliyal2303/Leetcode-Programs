class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0,j=n;
        int []ans=new int[2*n];
        for(int k=0;k<nums.length;k++)
        {
            
            if(k%2==0)
            {
                ans[k]=nums[i];
                i++;
            }
            else
            {
                 ans[k]=nums[j];
                j++;
            }
            
        }
        return ans;
    }
}