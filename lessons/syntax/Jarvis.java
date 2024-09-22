package lessons.syntax;

// Класс для примеров. Перегрузка
public class Jarvis {

    public static void main(String[] args) {
        sayHi("Randy", true);
    }
    
    public static void sayHi(String name){
        System.out.println("Hello, " + name + "!");
    }

    public static void sayHi(String name, Boolean isNotificBoolean){
        System.out.print("Hello, " + name + "!");
        if(isNotificBoolean.equals(true)){
            System.out.print(" I'll notify about your arrival.");
        }
        System.out.println();
    }

}