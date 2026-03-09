import java.util.*;

public class BookingService {

    private RoomInventory inventory;
    private Set<String> allocatedRoomIds;
    private Map<String, Set<String>> roomAllocations;
    private int roomCounter = 1;

    public BookingService(RoomInventory inventory) {
        this.inventory = inventory;
        allocatedRoomIds = new HashSet<>();
        roomAllocations = new HashMap<>();
    }

    public void processBookings(Queue<Reservation> bookingQueue) {

        while (!bookingQueue.isEmpty()) {

            Reservation reservation = bookingQueue.poll();
            String roomType = reservation.getRoomType();

            int available = inventory.getAvailability(roomType);

            if (available > 0) {

                String roomId = generateRoomId(roomType);

                allocatedRoomIds.add(roomId);

                roomAllocations
                        .computeIfAbsent(roomType, k -> new HashSet<>())
                        .add(roomId);

                inventory.updateAvailability(roomType, available - 1);

                System.out.println("Booking Confirmed!");
                System.out.println("Guest: " + reservation.getGuestName());
                System.out.println("Room Type: " + roomType);
                System.out.println("Assigned Room ID: " + roomId);
                System.out.println();

            } else {

                System.out.println("Booking Failed for "
                        + reservation.getGuestName()
                        + " (No rooms available for "
                        + roomType + ")");
            }
        }
    }

    private String generateRoomId(String roomType) {

        String prefix = roomType.replace(" ", "").substring(0, 2).toUpperCase();
        String roomId = prefix + roomCounter++;

        while (allocatedRoomIds.contains(roomId)) {
            roomId = prefix + roomCounter++;
        }

        return roomId;
    }
}