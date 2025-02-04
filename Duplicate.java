import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1}; 
        findDuplicates(nums);
    }

    public static void findDuplicates(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                System.out.println("Duplicate: " + nums[i]);
            }
        }
    }
}
