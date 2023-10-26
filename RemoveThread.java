public class RemoveThread extends Thread {
    private Inventory inventory;

    public RemoveThread(Inventory inventory) {
        this.inventory = inventory;
    }

    public void run() {
        inventory.removeItem();
    }
}
