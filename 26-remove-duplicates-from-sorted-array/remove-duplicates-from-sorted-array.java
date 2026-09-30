class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {

                int temp = nums[i];
                nums[i] = nums[j + 1];
                nums[j + 1] = temp;
                j++;
            }
        }
        return j + 1;
    }
}