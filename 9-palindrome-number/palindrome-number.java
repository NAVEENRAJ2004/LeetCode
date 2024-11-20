class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        char ch;
        String nstr="";
        for (int i=0; i<s.length(); i++)
        {
            ch= s.charAt(i);
            nstr= ch+nstr;
        }
        return s.equals(nstr);
    }
}