class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length, l2 = nums2.length;
        int i = 0, j = 0;
        int median1 = 0, median2 = 0;
        for(int c = 0; c < (l1 + l2)/2+1; c++){
            median2 = median1;
            if(i < l1 && j < l2){
                if(nums1[i] > nums2[j]){
                    median1 = nums2[j];
                    j++;
                }else{
                    median1 = nums1[i];
                    i++;
                }
            }else if(i < l1){
                median1 = nums1[i];
                i++;
            }else{
                median1 = nums2[j];
                j++;
            }
        }
        if((l1 + l2)%2 == 1){
            return (double) median1;
        }else{
           return (median1 + median2) / 2.0;
        }
    }
}
