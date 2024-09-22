package lessons.oop;

// Класс для примеров. Наследование
// Реализация абстрактного класса Car
public class Sedan extends Car {

    public static void main(String[] args) {
        Sedan bmw = new Sedan();
        bmw.setModel("BMW");
        bmw.setMaxSpeed(320);
        bmw.setColor("dark blue");

        bmw.gas();
        bmw.turnSignal();
    }

    // аннотация, говорящая компилятору и том что происходит переопределение или (в данном случае) реализация метода
    @Override
    public void gas(){
        System.out.println("Полный вперед!");
    }

    @Override
    public void turnSignal(){
        System.out.println("Прости, что?");
    }
}