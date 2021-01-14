//Given an array nums of integers, return how many of them contain an even number of digits.
//iterate over array.check length of each number.Check if length is even or not.
public class FindNumbers {
    public int findNumbers(int[] nums) {
        int countDigit = 0, countEven = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            while (num > 0) {

                num = num / 10;
                countDigit++;

            }

            if (countDigit % 2 == 0) {
                countEven++;

            }
            countDigit = 0;
        }
        return countEven;
    }

    public static void main(String args[]) {
        FindNumbers f = new FindNumbers();
        int nums[] = new int[]{437, 315, 322, 431, 686, 264, 442};
        System.out.println(f.findNumbers(nums));
    }
}
