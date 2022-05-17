import behavior.fly.FlyNoWay;
import behavior.quack.Quack;

public class DynamicDuck extends Duck2 {

    public DynamicDuck() {
        flyBehavior = new FlyNoWay(); // Cannot fly at the start;
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a learning duck! I will learn to fly someday!");
    }
}
