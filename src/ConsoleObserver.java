// Concrete Observer: Console observer to display notifications.
class ConsoleObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Notification: " + message);
    }
}
