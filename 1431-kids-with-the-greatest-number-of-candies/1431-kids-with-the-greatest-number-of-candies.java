class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        ArrayList<Boolean> arr= new ArrayList<Boolean>();
        int max=0;
        for(int i=0;i<candies.length;i++)
        {
            if(max<candies[i])
                max=candies[i];
        }
        for(int i=0;i<candies.length;i++)
        {
            if(max<=candies[i]+extraCandies)
                arr.add(true);
            else
                arr.add(false);
        }
        return arr;
    }
}