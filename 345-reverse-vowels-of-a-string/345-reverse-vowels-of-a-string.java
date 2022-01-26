class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> vowels=new ArrayList<Character>();
        int i=0,len=0;
        char c;
        StringBuilder str = new StringBuilder(s);
        
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'
             ||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')   
            {
                vowels.add(s.charAt(i));
                len++;
            }
        }
        len--;
        for(i=0;i<s.length();i++)
        {
           if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'
             ||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')  
            {
               c=vowels.get(len);
               /* s.replace(Character.toString(s.charAt(i)),c);*/
                str.setCharAt(i,c);
                len--;
            }
        }
        s = str.toString();
        return s;
    }
}