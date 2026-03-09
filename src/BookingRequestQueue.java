import java.util.LinkedList;
import java.util.Queue;

public class BookingRequestQueue {

    private Queue<Reservation> bookingQueue;

    public BookingRequestQueue() {
        bookingQueue = new LinkedList<>();
    }

    public void addRequest(Reservation reservation) {
        bookingQueue.offer(reservation);
        System.out.println("Booking request added for " + reservation.getGuestName());
    }

    public void displayQueue() {

        System.out.println("\nCurrent Booking Requests in Queue:");

        for (Reservation r : bookingQueue) {
            r.displayReservation();
        }
    }
}