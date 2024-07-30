package Week_1_Exercises.Design_and_Algorithms.ObserverPattern;

public interface Stock {
    void registerObserver(Observer observer);
    void deregisterObserver(Observer observer);
    void notifyObservers();   
}
