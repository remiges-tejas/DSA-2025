class TestLinearSearch {

    public int findTargetElement(int arr[], int target) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == target) {
                return target;
            }
        }
        return -1;
    }

    // Swap the elements in the array
    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // Print the array
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Sort the elements using a simple bubble sort algorithm
    public void sortElements(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }

        printArray(arr); // Print the sorted array
    }

}

public class LinearSearch {

    public static void main(String[] args) {

        int nums[] = { 1, 25, 43, 2, 5, 6, };
        int target = 2;

        TestLinearSearch t1 = new TestLinearSearch();

        int result = t1.findTargetElement(nums, target);

        t1.printArray(nums);

        // Sort Elements

        t1.sortElements(nums);

        System.out.println("Element Found :" + result);

    }
}