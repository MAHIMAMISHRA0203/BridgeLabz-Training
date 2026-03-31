import java.util.*;

public class remove_duplicates {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
                nums[index] = nums[i];
                index++;
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        remove_duplicates rd = new remove_duplicates();
        int[] nums = { 1, 1, 2, 2, 3, 4, 4, 5 };
        int length = rd.removeDuplicates(nums);
        System.out.println("Length after removing duplicates: " + length);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
