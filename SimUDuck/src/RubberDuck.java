public class RubberDuck extends Duck {

    @Override
    void display() {
        System.out.println("Displaying Rubber Duck");
    }

    @Override
    void quack() {
        System.out.println("Rubber duck Squeak instead of Quack");
    }

    @Override
    void fly() {
        System.out.println("Rubber duck do not fly");
    }
}
