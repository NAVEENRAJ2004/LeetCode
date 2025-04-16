class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Creating a new hashmap
        HashMap<Integer, Integer> map = new HashMap<>();//<value,index>

        for(int i = 0; i < nums.length; i++) {
            //checking whether the map contains the value of the index by subracting the current index by the target eg. tar = 9, curr index = 2, 9-2 = 7, if 7 present in the map then return index of the elements
            if(map.containsKey(target-nums[i])){
                return new int[] { map.get(target-nums[i]), i};
            }
            //else add the element to the hashmap and let the loop run
            map.put(nums[i], i);
        }
        //return empty array if we do not find anything
        return new int[] {};
    }
}