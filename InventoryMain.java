public class InventoryMain {
    public static void main(String args[]) {
        Inventory inventory = new Inventory();
        Integer adds = Integer.valueOf(args[0]);
        Integer removes = Integer.valueOf(args[1]);

        Thread[] addThreads = new Thread[adds];

        for (int i = 0; i < adds; i++) {
            addThreads[i] = new AddThread(inventory);
            addThreads[i].start();
        }

        Thread[] removeThreads = new Thread[removes];

        for (int i = 0; i < removes; i++) {
            removeThreads[i] = new RemoveThread(inventory);
            removeThreads[i].start();
        }

        for (int i = 0; i < adds; i++) {
            try {
                addThreads[i].join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        for (int i = 0; i < removes; i++) {
            try {
                removeThreads[i].join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        System.out.println("Final inventory size = " + inventory.getNumberOfItems());
    }
}