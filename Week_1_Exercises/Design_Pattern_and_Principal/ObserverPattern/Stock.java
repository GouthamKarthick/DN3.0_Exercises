package Week_1_Exercises.Design_Pattern_and_Principal.ObserverPattern;

public interface Stock {
    void registerObserver(Observer observer);
    void deregisterObserver(Observer observer);
    void notifyObservers();   
}
