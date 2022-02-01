class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //calculate max of array, then compare with each 
        //element whether its sum along with extra candies 
        //is more than the maximum
        ArrayList<Boolean> arr= new ArrayList<Boolean>();
        int max=0;
        for(int i=0;i<candies.length;i++)
        {
            if(max<candies[i])
                max=candies[i];
        }
        System.out.print(max);
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