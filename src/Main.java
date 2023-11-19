import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarShop shop = CarShop.getInstance();
        shop.addObserver(new ConsoleObserver());
        CarFactory factory = new CarFactory();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1 - Add new Car");
            System.out.println("2 - Add additional features");
            System.out.println("3 - Delete car from the cart");
            System.out.println("4 - Apply chosen to the site car");
            System.out.println("5 - Charge car with Lighting or with fast charging");
            System.out.println("6 - Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    shop.listCars();
                    System.out.print("Enter the model of the car you want to add: ");
                    String model = scanner.next();
                    double price = scanner.nextDouble(); // You can set the actual prices here.
                    Car chosenCar = factory.createCar(model, price);
                    shop.addCar(chosenCar);
                    break;

                case 2:
                    if (!shop.getInventory().isEmpty()) {
                        shop.listCars();
                        System.out.print("Enter the model of the car to add features to: ");
                        model = scanner.next();
                        Car carToDecorate = null;
                        int index = -1; // Keep track of the index of the car in the inventory
                        for (int i = 0; i < shop.getInventory().size(); i++) {
                            Car car = shop.getInventory().get(i);
                            if (car.getName().equalsIgnoreCase(model)) {
                                carToDecorate = car;
                                index = i;
                                break;
                            }
                        }
                        if (carToDecorate != null) {
                            System.out.println("Available features:");
                            System.out.println("1 - Winter wheels");
                            System.out.println("2 - LED headlights");
                            System.out.println("3 - Fast charging");
                            int featureOption = scanner.nextInt();
                            switch (featureOption) {
                                case 1:
                                    carToDecorate = new WinterWheelsDecorator(carToDecorate);
                                    break;
                                case 2:
                                    carToDecorate = new LedHeadlightsDecorator(carToDecorate);
                                    break;
                                case 3:
                                    carToDecorate = new FastChargingDecorator(carToDecorate);
                                    break;
                                default:
                                    System.out.println("Invalid feature option.");
                                    break;
                            }
                            System.out.println("Features added: " + carToDecorate.getName());
                            // Update the original car in the inventory
                            shop.getInventory().set(index, carToDecorate);
                        } else {
                            System.out.println("Car not found in inventory.");
                        }
                    } else {
                        System.out.println("No cars in the cart.");
                    }
                    break;


                case 3:
                    if (!shop.getInventory().isEmpty()) {
                        shop.listCars();
                        System.out.print("Enter the model of the car to delete: ");
                        model = scanner.next();
                        Car carToDelete = null;
                        for (Car car : shop.getInventory()) {
                            if (car.getName().equalsIgnoreCase(model)) {
                                carToDelete = car;
                                break;
                            }
                        }
                        if (carToDelete != null) {
                            shop.removeCar(carToDelete);
                            System.out.println(model + " removed from the cart.");
                        } else {
                            System.out.println("car not found in the cart.");
                        }
                    } else {
                        System.out.println("No cars in the cart.");
                    }
                    break;

                case 4:
                    if (!shop.getInventory().isEmpty()) {
                        shop.listCars();
                        System.out.print("Enter the new model of the car to apply to the site: ");
                        model = scanner.next();
                        Car carToBuy = null;
                        for (Car car : shop.getInventory()) {
                            if (car.getName().equalsIgnoreCase(model)) {
                                carToBuy = car;
                                break;
                            }
                        }
                        if (carToBuy != null) {
                            System.out.println("You successfully added new model of Car: " + carToBuy.getName());
                            shop.removeCar(carToBuy);
                        } else {
                            System.out.println("Car not found in the cart.");
                        }
                    } else {
                        System.out.println("No Cars in the cart.");
                    }
                    break;

                case 5:
                    if (!shop.getInventory().isEmpty()) {
                        shop.listCars();
                        System.out.print("Enter the model of the car to charge: ");
                        model = scanner.next();

                        Car carToCharge = null;
                        for (Car car : shop.getInventory()) {
                            if (car.getName().equalsIgnoreCase(model)) {
                                carToCharge = car;
                                break;
                            }
                        }

                        if (carToCharge != null) {
                            System.out.println("Charging options:");
                            System.out.println("1 - Lighting and slow charging");
                            System.out.println("2 - Quick charging");

                            int chargeOption = scanner.nextInt();

                            switch (chargeOption) {
                                case 1:
                                    System.out.println("Charging " + model + " with Lighting and slow");
                                    break;
                                case 2:
                                    QuickChargingAdapter adapter = new QuickChargingAdapter();
                                    adapter.chargeQuick(carToCharge);
                                    break;
                                default:
                                    System.out.println("Invalid charging option.");
                                    break;
                            }
                        } else {
                            System.out.println("Car not found in the inventory.");
                        }
                    } else {
                        System.out.println("No cars in the inventory.");
                    }
                    break;

            }
        }
    }
}
