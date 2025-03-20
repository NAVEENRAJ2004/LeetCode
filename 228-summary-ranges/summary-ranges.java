class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> arr = new ArrayList<>();
        if(nums.length == 0){
            return arr;
        }
        int s = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] - nums[i-1] != 1){
                if(s==nums[i-1]) {
                    arr.add(Integer.toString(s));
                    s = nums[i];
                    continue;
                }
                arr.add(Integer.toString(s) + "->" + Integer.toString(nums[i-1]));
                s = nums[i];
            }
            else if(nums[i]-nums[i-1] == 1 && i == nums.length - 1){
                arr.add(Integer.toString(s) + "->" + Integer.toString(nums[i]));
                continue;
            }
            else{
                continue;
            }
        }
        if( s == nums[nums.length - 1]){
            arr.add(Integer.toString(s));
        }
        return arr;
    }
}