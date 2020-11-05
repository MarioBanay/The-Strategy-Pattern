public abstract class Duck {
    void quack() {
        System.out.println("Quack from superclass");
    }

    void swim() {
        System.out.println("Swim from superclass");
    }

    void fly() {
        System.out.println("Fly from superclass");
    }

    abstract void display();
}
