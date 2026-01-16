public class Main {
    public static void main(String[] args) {
        // input array
        int arr[] = { 3, 67, 9, 2, 90 };
        // for loop to sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // checking if left element is greater than right if yes then swap
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // displaying element
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}