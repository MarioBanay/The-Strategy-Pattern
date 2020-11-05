public class MallardDuck extends Duck {

    public MallardDuck() {
        setQuackBehaviour(new Quack());
        setFlyBehaviour(new FlyWithWings());
    }

    @Override
    void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
