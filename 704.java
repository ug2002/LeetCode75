class Solution {
    public int search(int[] nums, int target) {
        int s =0;
        int e = nums.length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(target == nums[mid])return mid;
            else if(nums[mid] < target)s = mid+1;
            else if(nums[mid] > target)e = mid-1;
        }
        return -1;
    }
}

         
