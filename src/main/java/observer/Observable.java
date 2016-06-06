package observer;

public interface Observable{

    void addObserver(Observer observer);
    void actualizeAll(String change);
}