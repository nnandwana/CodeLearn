package ArrayPrograms;

public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count=0,temp=0;

        for(int i=0;i<nums.length;i++) {
            if(nums[i]==1) {
                count++;
            } else {
                if (count > temp) {
                    temp = count;
                }
                count=0;
            }
        }
        return Math.max(count, temp);
    }
}
