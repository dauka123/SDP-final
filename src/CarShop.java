import java.util.ArrayList;
import java.util.List;

// Singleton Pattern: CarShop ensures there is only one instance of the shop.
class CarShop {
    private static CarShop instance;

    private CarShop() {
    }

    public static CarShop getInstance() {
        if (instance == null) {
            instance = new CarShop();
        }
        return instance;
    }

    private List<Car> inventory = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void addCar(Car car) {
        inventory.add(car);
        notifyObservers("Added " + car.getName() + " to the inventory.");
    }

    public void removeCar(Car car) {
        inventory.remove(car);
        notifyObservers("Removed " + car.getName() + " from the inventory.");
    }

    public void listCars() {
        System.out.println("Available cars:");
        for (Car car : inventory) {
            System.out.println(car);
        }
    }

    public List<Car> getInventory() {
        return inventory;
    }
}