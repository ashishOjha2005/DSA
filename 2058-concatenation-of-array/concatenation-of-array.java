class Solution {
    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] result = new int[n * 2];

        int i = 0;

        while (i < n) {
            result[i] = nums[i];
            i++;
        }

        i = 0;

        while (i < n) {
            result[n + i] = nums[i];
            i++;
        }

        return result;
    }
}

