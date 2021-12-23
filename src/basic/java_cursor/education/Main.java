package basic.java_cursor.education;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // * 1. Заповнити масив тільки парними числами
        // * 2. Заповнити масив рандомними числами
        // * 3. Вивести середнє значення масиву
        // * 4. Вивести суму всіх значень кратних 3
        // * 5. Вивести значення всіх парних індексів масиву
        // * 6. Просортувати масив в порядку зростання
        // * 7. Вивести найменше значення в масиві
        // * 8. Вивести найбільше значення масиву
        // * 9. Вивести суму значень всіх парних індексів
        // * 10.  Вивести перших 20 символів з таблиці ASCI

        // * 0. Створення масиву.
        CreatingAnArray creatingAnArray = new CreatingAnArray();
        int[] big_array = new int[creatingAnArray.creatingAnArray()];


        FillingTheArray fillingTheArray = new FillingTheArray();
        // * 1. Заповнити масив тільки парними числами FillingTheArray
        big_array = FillingTheArray.FillingInEvenNumbers(big_array);
        System.out.println("Завдання №  1 - Заповнити масив тільки парними числами:");
        System.out.println("Вміст масиву:  " + Arrays.toString(big_array));

        //*  Заповнити масив тільки непарними числами FillingInOddNumbers
        big_array = FillingTheArray.FillingInOddNumbers(big_array);
        System.out.println("Завдання № 0 - Заповнити масив тільки непарними числами:");
        System.out.println("Вміст масиву:  " + Arrays.toString(big_array));

        // * 2. Заповнити масив рандомними числами FillingWithRandomNumbers
        big_array = FillingTheArray.FillingWithRandomNumbers(big_array);
        System.out.println("Завдання № 2 - Заповнити масив випадковими числами:");
        System.out.println("Вміст масиву:  " + Arrays.toString(big_array));

        // * Заповнити масив з консоля числами FillingWithNumbersFromTheConsole
        big_array = FillingTheArray.FillingWithNumbersFromTheConsole(big_array);
        System.out.println("Завдання № - Заповнити масив з консолю числами:");
        System.out.println("Вміст масиву:  " + Arrays.toString(big_array));


        // * Заповнення масиву випадковими числами кратними до того числа яке було ведено
        Scanner scan = new Scanner(System.in);
        byte multiplicity = 0;
        while ((multiplicity > 100) | (multiplicity < 2)) {
            System.out.println("Ведіть кратність значень масиву");
            System.out.println("Число повене бути цілим та в межах від 2 <= X = 100");
            System.out.println("Ведіть буть ласка кратність значень масиву:");

            while (!scan.hasNextByte()) { //перевірка веденого числа
                System.out.println("Це не число!");
                scan.next();
            }
            multiplicity = scan.nextByte();
        }
        big_array = FillingTheArray.FillingInMultiplicity_Is_setNumbers(big_array, multiplicity);
        System.out.println("Завдання № - Заповнити масив з консолю числами:");
        System.out.println("Вміст масиву:  " + Arrays.toString(big_array));


        ArrayOperations arrayOperations = new ArrayOperations();

        //  3. Вивести середнє значення масиву
        System.out.println("Середне значення масиву = " + arrayOperations.TheAverageValueOfTheArray(big_array));

        //  4. Вивести суму всіх значень кратних 3
        System.out.println("Сума всіх значень масиву кратних 3 = " + arrayOperations.TheSumOfMultiples(big_array, 3));
        //  8. Вивести найбільше значення масиву
        System.out.println("Найбільше число масиву = " + arrayOperations.ArraysMax(big_array));
        //  7. Вивести найменше значення в масиві
        System.out.println("Найменьше число масиву = " + arrayOperations.ArraysMini(big_array));

        //  5. Вивести значення всіх парних індексів масиву TheValueOfAllPairedIndices

        arrayOperations.TheValueOfAllPairedIndices(big_array);

        //  9. Вивести суму значень всіх парних індексів
        System.out.println("Сума чисел парних індексів масиву = " + arrayOperations.TheSumOfTheValuesOfAllPairedIndices(big_array));

        // * 10.  Вивести перших 20 символів з таблиці ASCI
        OutputValueASCI outputValueASCI = new OutputValueASCI();
        outputValueASCI.outputValueASCI(32, 52);

        //* (завдання з зірочкою)
        //Заповнити масив рандомними числами, вивести їх, потім поміняти місцями парні з непарними

        ReplaceTheElementsInTheArrayEvenWithOdd replaceTheElementsInTheArrayEvenWithOdd = new ReplaceTheElementsInTheArrayEvenWithOdd();
        big_array = replaceTheElementsInTheArrayEvenWithOdd.ReplaceTheElementsInTheArrayEvenWithOdd(big_array);
        System.out.println("Вміст масиву після заміни місцями парні з непарними" + ":  \n" + Arrays.toString(big_array));

        int[] big_arrayTwo = new int[big_array.length];
        big_arrayTwo = big_array;
        // * 6. Просортувати масив в порядку зростання

        ArraySorting arraySorting = new ArraySorting();
        big_array = arraySorting.BubbleSortOptimisedMax(big_array);
        System.out.println(Arrays.toString(big_array));

        // * 6. Просортувати масив в порядку зростання
        big_arrayTwo = arraySorting.BubbleSortMax(big_arrayTwo);
        System.out.println(Arrays.toString(big_arrayTwo));

    }


}
