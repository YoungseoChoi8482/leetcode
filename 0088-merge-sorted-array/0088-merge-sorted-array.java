class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];

        int big = Math.max(m,n);

        int i = 0;
        int j = 0; 
        int k = 0;

        while(i <m  &&  j < n)
        {
            if(nums1[i] < nums2[j])
            {
                arr[k++] = nums1[i++];
            }
            else
            {
                arr[k++] = nums2[j++];
            }
        }

       while( j < n)
       {
        arr[k++] = nums2[j++];
       }

       while(i < m)
       {
        arr[k++] = nums1[i++];
       }

       for(int l = 0; l < m+n; l++)
       {
        nums1[l] = arr[l];
       } 

    }
}