class Solution {
    public int[] shuffle(int[] nums, int n) {
        int temp[] =new int[2*n];
        int k=0;
        for(int i=0;i<n;i++){
            temp[k++]=nums[i];
            temp[k++]=nums[i+n];
        }
        return temp;
    }
}