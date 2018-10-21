package sort;

import java.util.ArrayList;
import java.util.List;

public class CountSort implements ISort {
    @Override
    public void sort(int[] arr) {
        int maxEle = max(arr);
        int minEle = min(arr);
        int len = maxEle - minEle + 1;
        int[] countArray = new int[len];
        for (int ele : arr) {
            countArray[ele - minEle] += 1;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < countArray.length; i++) {
            for (int j = 0; j < countArray[i]; j++) {
                list.add(minEle + i);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }

    int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int ele : arr) {
            if (ele > max) {
                max = ele;
            }
        }
        return max;
    }

    int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int ele : arr) {
            if (ele < min) {
                min = ele;
            }
        }
        return min;
    }
}
