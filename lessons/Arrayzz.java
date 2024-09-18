package lessons;

import java.util.Arrays;

// Класс для примеров. Массивы
/*
 массывы в которые ничего не присваивается, но обявляется размер, по умолчанию задаются 0, null либо false. В зависимости от типа значений в массиве
*/
public class Arrayzz {

    // Одномерные массивы
    static int[] arr = {17,25,37};
    static int[] arrEmpty = new int[5];
    static String[] arrString = { "Я", "Они", "Мы"};
    static String[] arrStringEmpty = new String[2];
    static boolean[] arrBool = {true, false, true};
    static boolean[] arrBoolEmpty = new boolean[5];

    // Двумерный массив
    static int[][] table = {{1,2,3},{4,5,6},{7,8,9}};
    static int[][] tablEmpty = new int[2][3];

    public static void main(String[] args) {
        System.out.println("print array of numbers");
        System.out.println(arr); // [[I@...
        printArray(arr);         // [17, 25, 37]
        System.out.println(arrEmpty); // [[I@...
        printArray(arrEmpty);         // [0, 0, 0, 0, 0]
        System.out.println("");
        System.out.println("Распечатаем массивы строк");
        System.out.println(arrStringEmpty); // [[I@...
        printArrayStr(arrString);      // [null, null]
        System.out.println(arrString); // [[I@...
        printArrayStr(arrString);      // [Я, Они, Мы]
        System.out.println("");
        System.out.println("Распечатаем массивы с булеан значениями");
        System.out.println(arrBool); // [Z@7e9e5f8a
        printArrayBool(arrBool);     // [true, false, true]
        System.out.println(arrBoolEmpty); // [Z@8bcc55f
        printArrayBool(arrBoolEmpty);     // [false, false, false, false, false]

        System.out.println("");    
        System.out.println("И двумерные массивы чисел");
        System.out.println(table); // [[I@...
        print2DArray(table);       // [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        System.out.println(tablEmpty); // [[I@...
        print2DArray(tablEmpty);       // [[0, 0, 0], [0, 0, 0]]
    }

    // Метод, респечатывающий массив цифр и чисел
    public static void printArray(int[] _arr){
        String arrStr = Arrays.toString(_arr);
        System.out.println(arrStr);
    }

    // Метод, респечатывающий массив строк
    public static void printArrayStr(String[] _arrString){
        String arrStr = Arrays.toString(_arrString);
        System.out.println(arrStr);
    }

    // Метод, респечатывающий массив булеан значение
    public static void printArrayBool(boolean[] _arrBool){
        String arrBool = Arrays.toString(_arrBool);
        System.out.println(arrBool);
    }

    // Метод, респечатывающий двумерный массив
    public static void print2DArray(int[][] _table){
        String tableStr = Arrays.deepToString(_table);
        System.out.println(tableStr);
    }
}