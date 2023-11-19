// Adapter Pattern: Adapter to charge a car quickly.
class QuickChargingAdapter {
    public void chargeQuick(Car car) {
        if (car != null) {
            System.out.println("Quick charging " + car.getName() + " with a high-power charger.");
        } else {
            System.out.println("Invalid car provided for quick charging.");
        }
    }
}
