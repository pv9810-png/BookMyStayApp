public class RoomSearchService {

    private RoomInventory inventory;

    public RoomSearchService(RoomInventory inventory) {
        this.inventory = inventory;
    }

    public void searchAvailableRooms() {

        System.out.println("\n===== Available Rooms =====");

        checkRoom(new SingleRoom(), "Single Room");
        checkRoom(new DoubleRoom(), "Double Room");
        checkRoom(new SuiteRoom(), "Suite Room");
    }

    private void checkRoom(Room room, String roomType) {

        int availability = inventory.getAvailability(roomType);

        if (availability > 0) {
            room.displayRoomDetails();
            System.out.println("Available Rooms: " + availability);
            System.out.println();
        }
    }
}