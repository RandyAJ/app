package lessons.oop.abstraction;

// Класс для примеров. Наследование
// Реализация абстрактного класса Car
public class Sedan extends Car {
    String cheapVersion;

    public static void main(String[] args) {
        Sedan bmw = new Sedan("BMW", 320, "dark blue");
        bmw.cheapVersion = "Stage 1";

        System.out.println("Модель седана - " + bmw.getModel());
        bmw.gas();
        bmw.turnSignal();
    }

    // метод-конструктор
    public Sedan(String model, int maxSpeed, String color) {
        this.setModel(model);
        this.setMaxSpeed(maxSpeed);
        this.setColor(color);
    }

    // аннотация, говорящая компилятору и том что происходит переопределение или (в данном случае) реализация метода
    @Override
    public void gas(){
        System.out.println("Полный вперед!");
    }

    @Override
    public void turnSignal(){
        if(this.getModel().equals("BMW")){
            System.out.println("Прости, что?");
        } else {
            System.out.println("Включил поворотник");
        }
    }

    public void showCheapVersion(){
        System.out.println("Версия чип-тюнинга двигателя: " + this.cheapVersion);
    }
}