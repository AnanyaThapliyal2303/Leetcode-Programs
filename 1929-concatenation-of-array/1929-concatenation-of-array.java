class Solution {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int i=0;
        int[] ans = new int[2*len];
        for(i=0;i<len;i++)
        {
            ans[i]=nums[i];
            ans[i+len]=nums[i];
        }
        return ans;
    }
}