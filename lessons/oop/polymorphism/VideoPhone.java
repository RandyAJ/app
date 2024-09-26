package lessons.oop.polymorphism;

public class VideoPhone extends AbstractPhone {

    public static void main(String[] args) {
        //..
    }

    @Override
    public void call(Long number){
        System.out.println("Устанавливаем видеосвязь для абонента " + number);
    }

    @Override
    public void ring(Long number){
        System.out.println("Поступил видеозвонок от " + number);
    }
}
