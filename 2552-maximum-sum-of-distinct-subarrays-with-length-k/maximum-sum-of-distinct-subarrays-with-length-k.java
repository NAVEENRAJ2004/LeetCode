class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        long max = 0, curr = 0;
        for(int i = 0; i < nums.length; i++){
            curr += nums[i];
            mp.put(nums[i], mp.getOrDefault(nums[i],0) + 1);

            if(i >= k - 1){
                if (mp.size() == k) max = Math.max(max, curr);
                curr -= nums[i - k + 1];
                mp.put(nums[i - k + 1], mp.get(nums[i - k + 1]) - 1);
                if(mp.get(nums[i - k + 1]) == 0) mp.remove(nums[i - k +1]);
            }
        }
        return max;
    }
}