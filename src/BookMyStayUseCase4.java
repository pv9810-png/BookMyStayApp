public class BookMyStayUseCase4 {

    public static void run() {

        System.out.println("\n========== Use Case 4 ==========");
        System.out.println("Guest Room Search (Read Only)");

        RoomInventory inventory = new RoomInventory();

        RoomSearchService searchService = new RoomSearchService(inventory);

        searchService.searchAvailableRooms();
    }
}