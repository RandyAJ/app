package lessons;

import java.util.Arrays;

// Класс для примеров. Массивы
public class Arrayzz {

    

    // Одномерные массивы
    static int[] arr = {17,25,37};
    static int[] arrEmpty = new int[5];
    static String[] arrStringEmpty = new String[2];
    static String[] arrString = {
        "Я", "Они", "Мы"};

    // Двумерный массив
    static int[][] table = {{1,2,3},{4,5,6},{7,8,9}};
    static int[][] tablEmpty = new int[2][3];

    public static void main(String[] args) {
        System.out.println("Распечатаем массивы чисел");
        System.out.println(arr); // [[I@...
        printArray(arr);         // [17, 25, 37]
        
        System.out.println(arrEmpty); // [[I@...
        printArray(arrEmpty);         // [0, 0, 0, 0, 0]

        System.out.println("");
        System.out.println("Распечатаем массивы строк");
        System.out.println(arrStringEmpty); // [[I@...
        printArrayStr(arrStringEmpty);      // [null, null]
        
        System.out.println(arrString); // [[I@...
        printArrayStr(arrString);      // [Я, Они, Мы]

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

    public static void printArrayStr(String[] _arrString){
        String arrStr = Arrays.toString(_arrString);
        System.out.println(arrStr);
    }

    // Метод, респечатывающий двумерный массив
    public static void print2DArray(int[][] _table){
        String tableStr = Arrays.deepToString(_table);
        System.out.println(tableStr);
    }
}