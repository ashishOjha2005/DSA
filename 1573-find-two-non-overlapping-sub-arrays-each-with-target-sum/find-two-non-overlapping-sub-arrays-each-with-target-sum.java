 class Solution {
    public int minSumOfLengths(int[] arr, int target) {

        int n = arr.length;
        int[] left = new int[n];

        int sum = 0;
        int start = 0;
        int best = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            while (sum > target) {
                sum -= arr[start];
                start++;
            }

            if (sum == target) {

                int len = i - start + 1;

                if (start > 0 && left[start - 1] != 0) {
                    ans = Math.min(ans, len + left[start - 1]);
                }

                best = Math.min(best, len);
            }

            if (best != Integer.MAX_VALUE) {
                left[i] = best;
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}