package ArrayPrograms;

public class sortedSquares {
    public int[] sortedSquares(int[] nums) {
        int l=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]*nums[i];

        }
        for(int k=0;k<nums.length-1;k++) {
        for (int j=0;j<l-1;j++) {
            if (nums[j] > nums[j + 1]) {
                int temp = nums[j + 1];
                nums[j + 1] = nums[j];
                nums[j] = temp;
            }

        }
        l--;
        }
    return nums;
    }

    public static void main(String args[]) {
        sortedSquares s =new sortedSquares();
        int nums[]= new int[] {-4,-1,0,3,10};
                nums=s.sortedSquares(nums);
        for(int num:nums)
            System.out.println(num);

    }
}
