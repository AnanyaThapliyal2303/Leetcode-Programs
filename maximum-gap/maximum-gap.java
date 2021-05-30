class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n<2)
            return 0;
        int res=nums[1]-nums[0];
        for(int i=1;i<n-1;i++)
        {
            res=Math.max(res,nums[i+1]-nums[i]);
        }
        
        return res;
    }
}