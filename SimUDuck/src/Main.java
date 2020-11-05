public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.swim();
        mallardDuck.display();

        Duck readHeadDuck = new ReadHeadDuck();
        readHeadDuck.quack();
        readHeadDuck.swim();
        readHeadDuck.display();
    }
}
