// Concrete Decorator: Winter wheels feature.
class WinterWheelsDecorator extends CarDecorator {
    public WinterWheelsDecorator(Car car) {
        super(car);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 50.0;
    }

    @Override
    public String toString() {
        return getName() + " - Price: $" + getPrice();
    }
}