package lesson_11_strategy_design_pattern;

public class TestDuck {

    void performQuackBehavior(Duck duck) {
        duck.performQuack();
    }

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck babyDuck = new BabyDuck();
        babyDuck.changeQuackBehavior(new Quack());
        Duck decoyDuck = new DecoyDuck();

        TestDuck testDuck = new TestDuck();
        testDuck.performQuackBehavior(mallardDuck);
        testDuck.performQuackBehavior(babyDuck);
        testDuck.performQuackBehavior(decoyDuck);
    }
}
