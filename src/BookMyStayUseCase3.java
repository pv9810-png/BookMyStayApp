public class BookMyStayUseCase3 {

    public static void run() {

        System.out.println("\n========== Use Case 3 ==========");
        System.out.println("Centralized Room Inventory Management");

        RoomInventory inventory = new RoomInventory();

        inventory.displayInventory();

        System.out.println("\nChecking availability of Double Room:");
        System.out.println("Available: " + inventory.getAvailability("Double Room"));

        System.out.println("\nUpdating availability of Double Room to 4");
        inventory.updateAvailability("Double Room", 4);

        inventory.displayInventory();
    }
}