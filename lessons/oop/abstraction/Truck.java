package lessons.oop.abstraction;

public class Truck extends Car {
    int loadCapacity;
    boolean blindSpot;

    public static void main(String[] args) {
        Truck truck = new Truck("Грузовичок", 120, "grey");
        truck.loadCapacity = 100;
        truck.blindSpot = true;

        truck.gas();
        truck.turnSignal();
    }

    // метод-конструктор
    public Truck(String model, int maxSpeed, String color) {
        this.setModel(model);
        this.setMaxSpeed(maxSpeed);
        this.setColor(color);
    }

    @Override
    public void gas(){
        System.out.println("Газ");
    }

    @Override
    public void turnSignal() {
        System.out.println("Включил поворотник");
    }
}
