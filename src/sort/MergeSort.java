package sort;

public class MergeSort implements ISort {

    private int[] merge(int[] arr1, int[] arr2) {
        int[] mergeArr = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        while (true) {
            if (arr1[i] < arr2[j]) {
                mergeArr[i + j] = arr1[i];
                i++;
                if (i == arr1.length) {
                    System.arraycopy(arr2, j, mergeArr, i + j, arr2.length - j);
                    break;
                }
            } else {
                mergeArr[i + j] = arr2[j];
                j++;
                if (j == arr2.length) {
                    System.arraycopy(arr1, i, mergeArr, i + j, arr1.length - i);
                    break;
                }
            }
        }


        return mergeArr;
    }

    @Override
    public void sort(int[] arr) {
        int[] sortedArr = msort(arr);
        System.arraycopy(sortedArr, 0, arr, 0, arr.length);
    }

    private int[] msort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int half = arr.length / 2;

        int[] arr1 = new int[half];
        int[] arr2 = new int[arr.length - half];
        System.arraycopy(arr, 0, arr1, 0, half);
        System.arraycopy(arr, half, arr2, 0, arr.length - half);
        int[] l = msort(arr1);
        int[] r = msort(arr2);
        return merge(l, r);
    }
}
