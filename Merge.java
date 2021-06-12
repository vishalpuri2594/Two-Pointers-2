/**
 * @author Vishal Puri
 * // Time Complexity : O(n)
 * // Space Complexity : O(1)
 * // Did this code successfully run on Leetcode : Yes
 * // Any problem you faced while coding this :
 */

public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0) return;
        int ptr1=m-1;
        int ptr2=n-1;
        for(int i=m+n-1; ptr2>=0&& i>=0; i--){
            if(ptr1>=0 && nums1[ptr1]>=nums2[ptr2]){
                nums1[i]=nums1[ptr1--];
            } else{
                nums1[i]=nums2[ptr2--];
            }

        }
    }
}
