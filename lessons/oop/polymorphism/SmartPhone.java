package lessons.oop.polymorphism;

public class SmartPhone extends AbstractPhone {
    
    public static void main(String[] args) {
        //..
    }

    @Override
    public void call(Long number){
        System.out.println("Звоним по номеру " + number);
    }

    @Override
    public void ring(Long number){
        System.out.println("Входящий вызов от " + number);
    }
}
