public class AddThread extends Thread {
    private Inventory inventory;

    public AddThread(Inventory inventory) {
        this.inventory = inventory;
    }

    public void run() {
        inventory.addItem();
    }
}
