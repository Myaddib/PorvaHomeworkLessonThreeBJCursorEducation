package basic.java_cursor.education;

import java.util.Scanner;

public class CreatingAnArray {
    // створення масиву

    public int creatingAnArray() {

        Scanner scan = new Scanner(System.in);
        short arraySize = 0;


        while ((arraySize > 250) | (arraySize < 1)) {
            System.out.println("Ведіть розмір масиву");
            System.out.println("Число повене бути цілим та в межах від 1 <= X = 250");
            System.out.println("Ведіть буть ласка розмір масиву:");

            while (!scan.hasNextShort()) { //перевірка веденого числа
                System.out.println("Це не число!");
                scan.next();
            }
            arraySize = scan.nextShort();
        }

        System.out.println("Ви визначили розмір масиву : " + arraySize);
        return arraySize;

    }

}

