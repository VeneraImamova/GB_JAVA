package HW_1;

public class Task_2 {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 2, 1, 5, 3, 4};
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        for (int k = 0; k < ans.length; k++) {
            System.out.print(ans[k]);
        }

    }
}
