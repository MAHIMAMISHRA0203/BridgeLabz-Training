package collections;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 2, 2, 3, 4 };
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!ans.contains(arr[i]))
                ans.add(arr[i]);
        }

        System.out.println(ans);
    }

}
