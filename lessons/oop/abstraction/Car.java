package lessons.oop.abstraction;

// Класс для примеров. Абстрация
// абстрация в java - это принцип ООП, согласно которому при проектировании классов и создании объектов
// необходимо выделять только главные свойства сущности и отбрасывать второстепенные
public abstract class Car {

    // модификатор private говорит о том что переменные (или методы)
    // можно использовать только в рамках данного класса
    private String model;
    private int maxSpeed;
    private String color;

    public abstract void gas();
    public abstract void turnSignal();

    // перемень геттеров и сеттеров с модификатором public,
    // служат для того что вызываться в наследниках и сетить или гетить приватные переменные абстрактного класса
    public String getModel(){
        return this.model;
    }

    public void setModel(String _model){
        this.model = _model;
    }

    public int getMaxSpeed(){
        return this.maxSpeed;
    }

    public void setMaxSpeed(int _maxSpeed){
        this.maxSpeed = _maxSpeed;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String _color){
        this.color = _color;
    }
}
