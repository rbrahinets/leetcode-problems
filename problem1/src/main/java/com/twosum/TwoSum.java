package problem1.src.main.java.com.twosum;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) throws Exception {
        if (nums == null) {
            throw new NullPointerException("Array is null");
        }

        if (nums.length < 2) {
            throw new Exception("Length of array is invalid");
        }

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }

                if (nums[i] + nums[j] == target) {
                    result[0] = j;
                    result[1] = i;
                    break;
                }
            }
        }

        return result;
    }
}
