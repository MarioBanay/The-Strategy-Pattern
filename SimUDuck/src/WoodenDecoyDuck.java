public class WoodenDecoyDuck extends Duck {
    @Override
    void display() {
        System.out.println("Displaying WoodenDecoy Duck");
    }

    @Override
    void quack() {
        System.out.println("WoodenDecoy duck do not quack");
    }

    @Override
    void fly() {
        System.out.println("WoodenDecoy duck do not fly");
    }
}
