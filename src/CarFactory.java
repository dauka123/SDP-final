// Factory Pattern: Factory for creating cars.
class CarFactory {
    public Car createCar(String model, double price) {
        return new ConcreteCar(model, price);
    }
}
