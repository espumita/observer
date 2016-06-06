package observer;

public class Observer1 implements Observer {

    @Override
    public void update(String change) {
        System.out.println("Observer1 : " + change);
    }
}
