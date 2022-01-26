class Solution {
    public int dominantIndex(int[] nums) {
        int first=nums[0],second=0,i=0,firstindex=0;
        for(i=1;i<nums.length;i++)
        {
            if(first<=nums[i])
            {
                second=first;
                first=nums[i];
                firstindex=i;
            }
            else if(second<=nums[i])
            {
                second=nums[i];
            }
        }
        if(second*2<=first)
            return firstindex;
        else 
            return -1;
    }
}