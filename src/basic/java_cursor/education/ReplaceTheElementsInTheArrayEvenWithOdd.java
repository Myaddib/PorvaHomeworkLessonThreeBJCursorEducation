package basic.java_cursor.education;

public class ReplaceTheElementsInTheArrayEvenWithOdd {

    public int[] ReplaceTheElementsInTheArrayEvenWithOdd(int[] big_array) {

        int[] evenNumber = new int[big_array.length];
        int[] evenIndex = new int[big_array.length];
        int evenCount = 0;

        int[] oddNumber = new int[big_array.length];
        int[] oddIndex = new int[big_array.length];
        int oddCount = 0;

        for (int i = 0; i < big_array.length; i++) {
            if (big_array[i] % 2 == 0) {
                evenNumber[evenCount] = big_array[i];
                evenIndex[evenCount] = i;
                evenCount++;
            } else {
                oddNumber[oddCount] = big_array[i];
                oddIndex[oddCount] = i;
                oddCount++;
            }
        }

        if (oddCount > evenCount) {
            for (int i = 0; i < evenCount; i++) {
                big_array[oddIndex[i]] = evenNumber[i];
                big_array[evenIndex[i]] = oddNumber[i];
            }
        } else {
            for (int i = 0; i < oddCount; i++) {
                big_array[oddIndex[i]] = evenNumber[i];
                big_array[evenIndex[i]] = oddNumber[i];
            }
        }
        System.out.print("Парні числа масиву:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenNumber[i] + " ");
        }
        System.out.println();
        System.out.print("Непарні числа масиву:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddNumber[i] + " ");
        }
        System.out.println();
        return big_array;
    }
}
