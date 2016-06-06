package observer;

public class Observer2 implements Observer {

    @Override
    public void update(String change) {
        System.out.println("Observer2 : " + change);
    }
}
