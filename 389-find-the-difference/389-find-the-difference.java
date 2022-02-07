class Solution {
    public char findTheDifference(String s, String t) {
     HashSet<Character> h=new HashSet<Character>();
        int sumt=0,sums=0;
        for( int i=0;i<t.length();i++)
        {
            sumt+=(int)t.charAt(i);
        }
       for( int i=0;i<s.length();i++)
        {
            sums+=(int)s.charAt(i);
        }
        return (char)(sumt-sums);
    }
}