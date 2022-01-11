class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
          HashSet<Integer> hs=new HashSet<Integer>();
          int i=0,k=0;
        ArrayList<Integer> ar=new ArrayList<Integer>();
          
        for(i=0;i<nums1.length;i++)
        {
            hs.add(nums1[i]);
        }
        for(i=0;i<nums2.length;i++)
        {
           if(hs.contains(nums2[i]))
           {
               ar.add(nums2[i]);
               hs.remove(nums2[i]);
           }
        }
        int res[]=new int[ar.size()];
        for(i=0;i<ar.size();i++)
        {
            res[i]=ar.get(i);
            
        }
        return res;
    }
}