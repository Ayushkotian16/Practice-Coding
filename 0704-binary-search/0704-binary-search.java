class Solution {
    public int search(int[] nums, int target) {
        int right=nums.length-1,left=0;
        
        while(left<=right){
            int mid = (left+right)/2;
           
            if(target==nums[mid]){
                return mid;
            }else if(target<nums[mid]){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return -1;
    }
}