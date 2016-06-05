package observers;

public class Observer1 implements Observer {

    public void update(String change) {
        System.out.println("Observer1 : "+change);
    }
}
