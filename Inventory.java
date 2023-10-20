public class Inventory {
    private int numberOfItems = 0;

    public void addItem()
    {
        numberOfItems += 1;
    }

    public void removeItem()
    {
        numberOfItems -= 1;
    }

    public int getNumberOfItems()
    {
        return numberOfItems;
    }
}
