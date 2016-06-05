package observers;

public class Observer2 implements Observer {

    public void update(String change) {
        System.out.println("Observer2 : "+change);

    }
}
