package basic.java_cursor.education;

public class ArraySorting {

    private static void swapValues(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    //Бульбашкове сортування
    public int[] BubbleSortMax(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    swapValues(array, j, j - 1);
                }
            }
        }
        return array;
    }

    public int[] BubbleSortMin(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] < array[j]) {
                    swapValues(array, j, j - 1);
                }
            }
        }
        return array;
    }

    //Оптимізовано бульбашкове сортування
    public int[] BubbleSortOptimisedMax(int[] array) {
        int unsortedBelow = array.length;
        while (unsortedBelow != 0) {
            int lastSwap = 0;
            for (int i = 1; i < unsortedBelow; i++) {
                if (array[i - 1] > array[i]) {
                    swapValues(array, i, i - 1);
                    lastSwap = i;
                }
            }
            unsortedBelow = lastSwap;
        }
        return array;
    }

    public int[] BubbleSortOptimisedMin(int[] array) {
        int unsortedBelow = array.length;
        while (unsortedBelow != 0) {
            int lastSwap = 0;
            for (int i = 1; i < unsortedBelow; i++) {
                if (array[i - 1] < array[i]) {
                    swapValues(array, i, i - 1);
                    lastSwap = i;
                }
            }
            unsortedBelow = lastSwap;
        }
        return array;
    }

}
