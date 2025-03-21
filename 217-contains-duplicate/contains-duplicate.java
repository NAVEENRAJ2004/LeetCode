class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> num = new HashSet<>();
        for(int numm : nums) {
            if(num.contains(numm)){
                return true;
            }
            num.add(numm);
        }
        return num.size() != nums.length;
    }
}