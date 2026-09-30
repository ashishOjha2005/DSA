class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> list =new HashSet<>();
        List<Integer> list2 =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            if(list.contains(i)){
                continue;
            }
            else{
                list2.add(i);
            }
        }
        return list2;
    }
}