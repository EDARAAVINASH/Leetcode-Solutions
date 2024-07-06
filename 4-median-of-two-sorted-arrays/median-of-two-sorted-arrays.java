class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        int i=0,j=0,count=0;
        int idx2=(m+n)/2;
        int idx1=idx2-1;
        int ele1=-1,ele2=-1;
        while(i<m && j<n)
        {
            if(nums1[i]<nums2[j])
            {
                if(count==idx1) ele1=nums1[i];
                if(count==idx2) ele2=nums1[i];
                count++;
                i++;
            }
            else
            {
                if(count==idx1) ele1=nums2[j];
                if(count==idx2) ele2=nums2[j];
                count++;
                j++;
            }
        }
        while(i<m)
        {
            if(count==idx1) ele1=nums1[i];
            if(count==idx2) ele2=nums1[i];
            count++;
            i++;
        }
        while(j<n)
        {
            if(count==idx1) ele1=nums2[j];
            if(count==idx2) ele2=nums2[j];
            count++;
            j++;
        }
        if((m+n)%2==1)
        {
            return (double)ele2;
        }
        return (double)((ele2+ele1)/2.0);
    }
}