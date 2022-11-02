public class Main {
    public static void main(String[] args) {
        System.out.println("Алгоритм пирамидальной сортировки");

        int[] arr = {2000, 80, 2, 54, 13, 104, 523, 80, 26, 1, 12, 8};

        heapSort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapofi(arr, i, n);
        }
        for (int i = n - 1; i >= 0; i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapofi(arr, 0, i);
        }
    }

    private static void heapofi(int[] arr, int i, int n) {
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int largest = i;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]){
            largest = right;
        }
        if (i != largest){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapofi(arr, largest, n);
        }
    }
}