class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for( int i = 0; i < nums.length; i++){
            elementSum += nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            String numStr = String.valueOf(nums[i]);
            for (int j = 0; j < numStr.length(); j++){
                digitSum += numStr.charAt(j) - '0';
            } 
        }
        return Math.abs(elementSum - digitSum);
    }
}