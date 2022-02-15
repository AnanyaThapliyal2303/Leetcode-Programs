class Solution {
    public int singleNumber(int[] nums) {
       HashSet<Integer> h=new HashSet<Integer>();
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(h.contains(nums[i]))
            {
               h.remove(nums[i]);
            sum=sum-nums[i];
            }
            else
            {
              h.add(nums[i]);
                sum=sum+nums[i];
            } 
        }
        
        return sum;
    }
}