package ArrayPrograms;
//Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
//nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
public class MereSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n;
        int i,j;
        int count=0;
        for (i = 0,j = 0;(i < length && j<n); i++, j++) {
            count++;
            System.out.println(count);
            if(m==0) {
                System.out.println("inside if");
                nums1[i]=nums2[j];
            }
            else if (nums1[i] < nums2[j] && nums2[j] <= nums1[i + 1]) {
                System.out.println("inside first if");
                nums1[m] = nums1[m - 1];
                nums1[m-1] = nums1[i+1];
                nums1[i+1]=nums2[j];
                m++;
            } else if(nums1[i] < nums2[j] && nums2[j] >= nums1[i + 1]) {
                System.out.println("inside second if");
                for(int k=1;k<i+1;k++)
                {
                    nums1[m]=nums1[m-k];
                    nums1[i+2]=nums2[j];
                }


                m++;

            } else if(nums1[i]>nums2[j]) {
                System.out.println("inside third if");
                nums1[m]=nums1[m-1];
                nums1[m-1]=nums1[i+1];
                nums1[i+1]=nums1[i];
                nums1[i]=nums2[j];
                m++;
            }
        }
        for (int num : nums1) {
            System.out.println(num);
        }

    }
    public static void main(String args[]) {
        MereSortedArray m = new MereSortedArray();
        int nums1[]=new int[]{1,2,4,5,6,0};
           int nums2[]=new int[]{3};

        m.merge(nums1,5,nums2,1);

    }
}
