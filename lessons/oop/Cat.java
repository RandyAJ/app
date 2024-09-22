package lessons.oop;

// Класс для примеров. Создание объектов
public class Cat {
    
    String name;
    int age;

    // // статическая переменная принадлежит классу, а не экзмелярам объекта
    static int count = 0;
    public static void main(String[] args) {
        Cat freeman = new Cat("Morgan", 20);
        count++;

        Cat sydney = new Cat("Sweeney", 4);
        count++;

        System.out.println("Создано кошачьих: " + Cat.count + ", по именам: " + freeman.name + ", " + sydney.name);
        sydney.sayMeow();
    }

    // метод-конструктор
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayMeow(){
        System.out.println(this.name + " посаламкался!");
    }
}
