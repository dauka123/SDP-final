// Concrete Product: Car
class ConcreteCar implements Car {
    private String model;
    private double price;

    public ConcreteCar(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String getName() {
        return model;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return model + " - Price: $" + price;
    }
}