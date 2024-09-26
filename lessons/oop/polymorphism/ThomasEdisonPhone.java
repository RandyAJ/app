package lessons.oop.polymorphism;

public class ThomasEdisonPhone extends AbstractPhone {

    public static void main(String[] args) {
        //..
    }

    @Override
    public void call(Long number){
        System.out.println("Накручиваем цифры для звонка по номеру " + number);
    }

    @Override
    public void ring(Long number){
        System.out.println("Звонит телефон!");
    }
}
