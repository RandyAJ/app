package lessons.oop;

// Класс для примеров. Создание объектов
public class Cat {
    
    String name;
    short age;

    // статическая переменная принадлежит классу, а не экзмелярам объекта
    static int count = 0;
    public static void main(String[] args) {
        Cat freeman = new Cat();
        freeman.name = "Morgan";
        freeman.age = 4;
        count++;

        Cat sydney = new Cat();
        sydney.name = "Sweeney";
        sydney.age = 20;
        count++;

        System.out.println("Создано кошачьих: " + Cat.count + ", по именам: " + freeman.name + ", " + sydney.name);
        sydney.sayMeow();
    }

    public void sayMeow(){
        System.out.println(this.name + " посаламкался!");
    }
}
