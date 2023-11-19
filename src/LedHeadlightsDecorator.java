// Concrete Decorator: LED headlights feature.
class LedHeadlightsDecorator extends CarDecorator {
    public LedHeadlightsDecorator(Car car) {
        super(car);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 30.0;
    }

    @Override
    public String toString() {
        return getName() + " - Price: $" + getPrice();
    }
}

