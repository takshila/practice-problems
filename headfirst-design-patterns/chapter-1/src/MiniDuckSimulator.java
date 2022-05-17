import behavior.fly.FlyWithWings;

public class MiniDuckSimulator {
    public static void main(String[] args) {
//        Duck mallard = new MallardDuck();
//        mallard.performQuack();
//        mallard.performFly();

        Duck2 dynamic = new DynamicDuck();
        dynamic.display();
        dynamic.performFly();
        // Changing the behavior at runtime
        dynamic.setFlyBehavior(new FlyWithWings());
        dynamic.performFly();
    }
}
