package lessonsSyntax;

// Класс для примеров. Циклы
public class Cycles {
    public static void main(String[] args) {
        int[] arr = Arrayzz.arr;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if(sum > 30){
                break;
            }
        }
        System.out.println(sum);

        for (int num : arr) {
            System.out.print(num + ", ");
        }

        System.out.print("\n");

        int i = 0;
        Integer[] arrIntegers = {1,2,3,4,5};
        do { // выполняй код
            System.out.println(arrIntegers[i] + " человек-часов"); // [0]1 челов.., [1]2 челов..
            i++;
        } while (i != 2); // пока i не равен 2

        int[][] array2D = {
            {1,2,3},
            {11,22,33},
            {44,55}
        };

        // в ситуации когда у нас ряд вложенных циклов мы можем воспользоваться меткой над циклом (read_rows).
        // С ее помощью я выйду из того цикла, в котором вызывается метка (break read_rows;) и продолжу итерацию того цикла, над которым висит лейбл
        // повторный цикл по одному массиву такой себе, трехмерный массив писать не хотелось
        for(int t = 0; t < array2D.length; t++){
            read_rows:
            for(int j = 0; j < array2D[i].length; j++){
                for(int q = 0; q < array2D[i].length; q++){
                    if(array2D[t][j] == 22){
                        break read_rows;
                    }
                    System.out.println(array2D[t][j]);
                }
            }
        }
    }
}
