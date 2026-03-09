public class BookMyStayUseCase5 {

    public static void run() {

        System.out.println("\n========== Use Case 5 ==========");
        System.out.println("Booking Request Queue (FIFO)");

        BookingRequestQueue queue = new BookingRequestQueue();

        // Simulating guest booking requests
        queue.addRequest(new Reservation("Alice", "Single Room"));
        queue.addRequest(new Reservation("Bob", "Double Room"));
        queue.addRequest(new Reservation("Charlie", "Suite Room"));

        queue.displayQueue();
    }
}