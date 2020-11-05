public class ModelDuck extends Duck {
    public ModelDuck() {
        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new Quack());
    }

    @Override
    void display() {
        System.out.println("I'm a model Duck");
    }
}
