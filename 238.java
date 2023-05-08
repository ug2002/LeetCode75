class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans [] = new int[n];
        int [] prefixStart = new int[n];
        int [] prefixEnd = new int[n];
        prefixStart[0] = nums[0];
        for(int i =1; i<n; i++){
            prefixStart[i] = prefixStart[i-1] * nums[i];
        }
        // prefixStart = 1 2 6 24
        prefixEnd[n-1] = nums[n-1];
        for(int i= n-2; i>=0; i--){
            prefixEnd[i] = prefixEnd[i+1]*nums[i];
        }
        // prefixEnd = 24 24 12 4
        ans[0] = prefixEnd[1]; //24
        ans[n-1] = prefixStart[n-2]; //6
        for(int i=1; i<n-1; i++){
            ans[i] = prefixStart[i-1]*prefixEnd[i+1];
        }
        return ans;

    }
}
