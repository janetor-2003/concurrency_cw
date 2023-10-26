public class Inventory {
    private int numberOfItems = 0;

    public synchronized void addItem() {
        numberOfItems++;
        System.out.println("Added. Inventory size = " + this.getNumberOfItems());
    }

    public synchronized void removeItem() {
        numberOfItems--;
        System.out.println("Removed. Inventory size = " + this.getNumberOfItems());
    }

    public synchronized int getNumberOfItems() {
        return numberOfItems;
    }
}
