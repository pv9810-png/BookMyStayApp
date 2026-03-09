import java.util.LinkedList;
import java.util.Queue;

public class BookMyStayUseCase6 {

    public static void run() {

        System.out.println("\n========== Use Case 6 ==========");
        System.out.println("Booking Allocation with Double Booking Prevention");

        RoomInventory inventory = new RoomInventory();

        Queue<Reservation> bookingQueue = new LinkedList<>();

        bookingQueue.offer(new Reservation("Alice", "Single Room"));
        bookingQueue.offer(new Reservation("Bob", "Double Room"));
        bookingQueue.offer(new Reservation("Charlie", "Suite Room"));
        bookingQueue.offer(new Reservation("David", "Single Room"));

        BookingService bookingService = new BookingService(inventory);

        bookingService.processBookings(bookingQueue);
    }
}