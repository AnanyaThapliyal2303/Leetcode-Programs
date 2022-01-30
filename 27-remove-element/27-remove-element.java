class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> arr=new  ArrayList<Integer>();
        int i=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
                arr.add(nums[i]);
                
        }
        int len=arr.size();
        for(i=0;i<len;i++)
        {
              nums[i]= arr.get(i);
                
        }
        
        return len;
        
    }
}