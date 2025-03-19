class Solution {
    public int majorityElement(int[] nums) {
        int m = nums[0];
        int count = 1;
        for(int i = 0;i < nums.length;i++) {
            if(m==nums[i]){
                count+=1;
            }else{
                count--;
                if(count == 0) {
                    count+=1;
                    m = nums[i];
                }
            }
        }
        return m;
    }
}