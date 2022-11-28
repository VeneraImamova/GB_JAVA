package HW_1;


public class Task_3 {
    public int main(int[] nums, int val) {
        int sortedInd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[sortedInd++] = nums[i];
            }
        }
        return sortedInd;
    }
}
