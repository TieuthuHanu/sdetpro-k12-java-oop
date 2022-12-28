package lesson_11_strategy_design_pattern;

public class Duck {

    QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quackable();
    }

    public void changeQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
