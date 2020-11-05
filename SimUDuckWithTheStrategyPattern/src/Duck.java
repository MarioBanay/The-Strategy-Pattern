public abstract class Duck {

    // Separate what changes (Flying and Quack behaviours) from what stays
    // the same (the rest of behaviours)
    // Create new set of classes to represent each behaviour -> Interfaces (or Abstract class)
    // Coding to interface, to to implementation!!

    //    void quack() {
    //        System.out.println("Quack from superclass");
    //    }

    //    void fly() {
    //        System.out.println("Fly from superclass");
    //    }

    public Duck() {}

    // Behaviours added as instance variables
    // Composition over Inheritance!
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    abstract void display();

    // Methods that perform behaviour
    void performQuack() {
        // delegating to the behaviour class
        quackBehaviour.quack();
    }

    void performFly() {
        // delegating to the behaviour class
        flyBehaviour.fly();
    }

    public void swim() {
        System.out.println("All ducks swim!");
    }

    // setters
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

}
