class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i : nums){
            int sums = 0;
            while(i>0){
            sums += i%10;
            i/=10;
            }
            min = Math.min(min,sums);
        }
        return min;
    }
}