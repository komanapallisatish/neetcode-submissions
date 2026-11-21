class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr=new int[m+n];
       
        int c=0;
        int i=0,j=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[c]=nums1[i];
                i++;
                c++;
            }else{
                arr[c]=nums2[j];
                j++;
                c++;
            }
        }
        while(i<m){
            arr[c]=nums1[i];
                i++;
                c++; 
        }
        while(j<n){
             arr[c]=nums2[j];
                j++;
                c++;

        }
         for (int k = 0; k < m + n; k++) {
            nums1[k] = arr[k];
        }
    }
}