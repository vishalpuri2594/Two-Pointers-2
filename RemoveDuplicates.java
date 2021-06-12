/**
 * @author Vishal Puri
 * // Time Complexity : O(n)
 * // Space Complexity : O(1)
 * // Did this code successfully run on Leetcode : Yes
 * // Any problem you faced while coding this :
 */

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int freq=1, j=1, elem=nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]==elem)
                freq++;
            else
                freq=1;
            elem=nums[i];
            if(freq<=2)
                nums[j++]=elem;
        }
        return j;
    }
}
