class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result=new HashSet<>();
        int right=nums.length-1,middle;
        Arrays.sort(nums);
        for(int left=0;left<=nums.length-3;left++){
            middle=left+1;
            right=nums.length-1;
            while(middle<right){    
                if(nums[left]+nums[middle]+nums[right]==0){
                    result.add(Arrays.asList(nums[left],nums[middle],nums[right]));
                    middle++;
                    right--;
                }else if(nums[left]+nums[middle]+nums[right]>0){
                    right--;
                }else{
                    middle++;
                }
            }
        }
return new ArrayList<>(result);        }
    }
