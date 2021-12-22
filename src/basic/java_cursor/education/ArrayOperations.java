package basic.java_cursor.education;

public class ArrayOperations {

    public float TheAverageValueOfTheArray(int[] array) {
        int symm = 0;
        for (int i = 0; i < array.length; i++) {
            symm = symm + array[i];
        }
        return symm / (array.length + 1);
    }

    public int TheSumOfMultiples(int[] array, int x) {
        int symm = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % x == 0) {
                symm = symm + array[i];
            }
        }
        return symm;
    }

    public int ArraysMax(int[] array) {
        int max = array[1];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];      // 8.   Вивести найбільше значення масиву
            }
        }
        return max;
    }

    public int ArraysMini(int[] array) {
        int min = array[1];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {      // 7.   Вивести найменше значення в масиві
                min = array[i];
            }
        }
        return min;
    }

    public void TheValueOfAllPairedIndices(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && i != 0) {      // 7.   Вивести найменше значення в масиві
                System.out.print("ін." + i + "=" + array[i] + ", ");
            }
        }
        System.out.println();
    }

    public int TheSumOfTheValuesOfAllPairedIndices(int[] array) {
        int symm = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && i != 0) {      // 7.   Вивести найменше значення в масиві
                symm = symm + array[i];
            }
        }
        return symm;
    }
}


