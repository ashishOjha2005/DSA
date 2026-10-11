class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int position = 1; position <= n ; position++){
            if(n % position == 0){
                 int currentElement = nums[position - 1];
                sum += currentElement * currentElement;
            }
        }
        return sum;
        
    }
}