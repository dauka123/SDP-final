// Concrete Decorator: Fast charging feature.
class FastChargingDecorator extends CarDecorator {
    public FastChargingDecorator(Car car) {
        super(car);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 40.0;
    }

    @Override
    public String toString() {
        return getName() + " - Price: $" + getPrice();
    }
}