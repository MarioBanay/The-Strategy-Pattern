public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.swim();
        mallardDuck.display();
        mallardDuck.fly();

        System.out.println("-- next Duck --");

        Duck readHeadDuck = new ReadHeadDuck();
        readHeadDuck.quack();
        readHeadDuck.swim();
        readHeadDuck.display();
        readHeadDuck.fly();

        System.out.println("-- next Duck --");

        Duck rubberDuck = new RubberDuck();
        rubberDuck.quack();
        rubberDuck.swim();
        rubberDuck.display();
        rubberDuck.fly();

        System.out.println("-- next Duck --");

        Duck woodenDecoyDuck = new WoodenDecoyDuck();
        woodenDecoyDuck.quack();
        woodenDecoyDuck.swim();
        woodenDecoyDuck.display();
        woodenDecoyDuck.fly();
    }
}
