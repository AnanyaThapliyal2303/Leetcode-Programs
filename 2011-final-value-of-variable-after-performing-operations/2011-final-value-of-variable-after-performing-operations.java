class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int i=0,res=0;
        for(i=0;i<operations.length;i++)
        {
            if(operations[i].compareTo("++X")==0 || operations[i].compareTo("X++")== 0)
                res=res+1; 
            else 
                res=res-1;
        }
        return res;
    }
}