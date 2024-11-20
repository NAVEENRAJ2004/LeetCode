class Solution {
    public int reverse(int x) {
        int rev = 0;
        boolean neg = x<0;
        int a = Math.abs(x);
        while(a>0){
            int last = a % 10;
            a = a/10;
            if (rev > (Integer.MAX_VALUE / 10) || (rev < (Integer.MIN_VALUE / 10))) {
                return 0;
            }
            rev = (rev*10)+last;
        }
        return neg ? -rev : rev;
    }
}