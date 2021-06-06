class Solution {
    
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> h=new HashSet<Integer>();
        
        for(int x:nums)
            h.add(x);
        
        int max_len=0;
        for(int i=0;i<nums.length;i++){
            int cur_num=nums[i];
            int cur_len=1;
            
            if(!h.contains(cur_num-1)){
                while(h.contains(cur_num+1)){
                    cur_num+=1;
                    cur_len+=1;
                }
                max_len=Math.max(max_len,cur_len);
            }
        }
        return max_len;
    }
}