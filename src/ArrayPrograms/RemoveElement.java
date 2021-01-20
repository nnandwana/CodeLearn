package ArrayPrograms;
//Input: nums = [0,1,2,2,3,0,4,2], val = 2
//Output: 5, nums = [0,1,4,0,3]
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int length=nums.length;
        int i=0;
        while(i<length) {
            if(nums[i]==val) {
                nums[i]=nums[length-1];
                length--;
            } else {
                i++;
            }
        }
        for(int num:nums) {
            System.out.println(num);
        }
    return length;
    }
    public static void main(String args[]) {
        RemoveElement r=new RemoveElement();
        int[] nums=new int[]{0,1,2,2,3,0,4,2};
        int val=2;
        int length=r.removeElement(nums,val);
        System.out.println("New length is " +length);

    }
}
