/*
Time complexity : O(n)
Space complexity: O(1)
*/
public class arrayProdWithoutSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        if(nums == null || nums.length == 0) return result;
        result[0] = 1;
        int rp = 1;
        //left pass
        for(int i=1; i<n; i++) {
            rp *= nums[i-1];
            result[i] = rp;
        }
        //right pass
        rp = 1;
        for(int j= n-2; j>=0; j--) {
            rp *= nums[j+1];
            result[j] *= rp;
        }
        return result;
    }
}