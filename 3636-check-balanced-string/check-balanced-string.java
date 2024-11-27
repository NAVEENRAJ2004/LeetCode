class Solution {
    public boolean isBalanced(String num) {
        int odd = 0;
        int even = 0;
        for(int i=0;i<num.length();i++) {
            int ch = Character.getNumericValue(num.charAt(i));
            if(i%2==0){
                even += ch;
            }
            else{
                odd += ch;
            }
        }
        return odd == even;
    }
}