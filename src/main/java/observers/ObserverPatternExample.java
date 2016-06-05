package observers;

public class ObserverPatternExample {
    public static void main(String[] args) {
        ObservedClass observedClass = new ObservedClass();
        observedClass.addObserver(new Observer1());
        observedClass.addObserver(new Observer2());

        observedClass.change("A change");
    }
}
