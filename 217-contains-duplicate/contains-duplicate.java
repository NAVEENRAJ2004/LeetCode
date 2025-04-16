class Solution {
    public boolean containsDuplicate(int[] nums){
        try{
        Arrays.sort(nums);
        for(int i=0 ; i<nums.length+1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.print("false");
        }
        return false;
    }
}