package lessons.oop.polymorphism;

// Класс-пример для полиморфизма.
// Суть полиморфизма в том что когда я создаю некую абстракцию с базовым поведением,
// которая реализовывается в ряде доменов, 
// то независимо от реализации параметры для поведения должны оставаться статичными.
// Так же это возможность работать с несколькими типами так, как будто это один и тот же тип
// иное мнение: Принцип в ООП, когда программа может использовать объекты с одинаковым интерфейсом
// без информации о внутреннем устройстве объекта, называется полиморфизмом
public class User {
    Long myNubmer;
    public static void main(String[] args) {
        User me = new User();
        me.myNubmer = 89999174217L;
        ThomasEdisonPhone vp = new ThomasEdisonPhone();
        me.callSomeOne(89999174230L, vp);

        User someOne = new User();
        VideoPhone vp2 = new VideoPhone();
        someOne.incomingCall(89098775252L, vp2);
    }

    public void callSomeOne(Long _number, AbstractPhone _phone){
        _phone.call(_number);
    }

    public void incomingCall(Long _number, AbstractPhone _phone){
        _phone.ring(_number);
    }
}
