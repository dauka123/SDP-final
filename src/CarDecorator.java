// Decorator Pattern: Decorator for adding additional features to a car.
class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String getName() {
        return car.getName();
    }

    @Override
    public double getPrice() {
        return car.getPrice();
    }
}
