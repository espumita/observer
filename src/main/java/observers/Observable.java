package observers;

public interface Observable{
    void addObserver(Observer observer);
    void actualizeAll(String change);
}