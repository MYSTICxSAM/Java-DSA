public class SubArraySumKadane {
    
    public int maxSubArray(int[] nums) {
        int cs = nums[0];  // current sum
        int ms = nums[0];  // max sum
        
        for(int i=1; i<nums.length; i++){
            cs = Math.max(nums[i], cs + nums[i]);
            ms = Math.max(ms, cs);
        }
        return ms;
}

}
