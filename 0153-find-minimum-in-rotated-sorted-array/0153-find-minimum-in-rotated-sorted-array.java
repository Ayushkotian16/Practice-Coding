class Solution {
    public int findMin(int[] nums) {
        int minn=Integer.MAX_VALUE;
        for (int i = 0; i<nums.length;i++){
            minn=Math.min(minn,nums[i]);
        }
        return minn;
    }
}