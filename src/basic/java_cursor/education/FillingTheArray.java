package basic.java_cursor.education;

import java.util.Random;
import java.util.Scanner;


public class FillingTheArray {

    public static int[] FillingInEvenNumbers(int[] big_array) {
        int bingo;
        Random random = new Random();
        for (int i = 0; i < big_array.length; i++) {
            bingo = random.nextInt(1000);
            while (bingo % 2 != 0) {
                bingo = random.nextInt(1000);
            }
            big_array[i] = bingo;

        }
        return big_array;
    }

    public static int[] FillingInOddNumbers(int[] big_array) {
        int bingo;
        Random random = new Random();
        for (int i = 0; i < big_array.length; i++) {
            bingo = random.nextInt(1000);
            while (bingo % 2 == 0) {
                bingo = random.nextInt(1000);
            }
            big_array[i] = bingo;

        }
        return big_array;
    }

    public static int[] FillingWithRandomNumbers(int[] big_array) {
        Random random = new Random();
        for (int i = 0; i < big_array.length; i++) {
            big_array[i] = random.nextInt(1000);
        }
        return big_array;
    }

    public static int[] FillingWithNumbersFromTheConsole(int[] big_array) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < big_array.length; i++) {
            System.out.print("Ведіть буть ласка значення масиву за індексом " + i + " = ");
            while (!scan.hasNextInt()) { //перевірка веденого числа
                System.out.println("Це не число!");
                System.out.println("Якщо число то вона нам непідходить!");
                System.out.println("Число повине бути цілим типу -Integer-!");
                System.out.print("Ведіть буть ласка значення масиву за індексом " + i + " = ");
                scan.next();
            }
            big_array[i] = scan.nextInt();
        }
        return big_array;
    }

    public static int[] FillingInMultiplicity_Is_setNumbers(int[] big_array, int x) {
        int bingo;
        Random random = new Random();
        for (int i = 0; i < big_array.length; i++) {
            bingo = random.nextInt(1000);
            while (bingo % x != 0) {
                bingo = random.nextInt(1000);
            }
            big_array[i] = bingo;

        }
        return big_array;
    }
}
