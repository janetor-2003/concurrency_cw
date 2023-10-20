public class Inventory {
    private int numberOfItems = 0;

    public synchronized void addItem()
    {
        numberOfItems += 1;
        System.out.println("Added. Inventory size = "+ getNumberOfItems());
    }

    public synchronized void removeItem()
    {
        numberOfItems -= 1;
        System.out.println("Removed. Inventory size = "+ getNumberOfItems());
    }

    public int getNumberOfItems()
    {
        return numberOfItems;
    }
}
