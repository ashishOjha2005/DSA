class Solution {
    public int maxProduct(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= firstMax) {
                secondMax = firstMax;
                firstMax = nums[i];
            } else if (nums[i] >= secondMax && nums[i] != firstMax) {
                secondMax = nums[i];
            }
        }
        long x = 1L * (firstMax - 1) * (secondMax - 1);
        return (int)x;

    }
}