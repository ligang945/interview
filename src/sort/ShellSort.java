package sort;

public class ShellSort implements ISort {
    @Override
    public void sort(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int j = 0; j < arr.length / gap; j++) {
                for (int k = j; k > gap - 1; k--) {
                    if (arr[k] < arr[k - gap]) {
                        swap(arr, k, k - gap);
                    }
                }
            }
        }
    }
}
