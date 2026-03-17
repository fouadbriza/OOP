public class ReservationService {
    private Customer[] customers = new Customer[100];
    private int customerCount = 0;
    private Reservation[] reservations = new Reservation[500];
    private int reservationCount = 0;
    private static int counter = 1;

    public void addCustomer(Customer c) {
        if (c != null && customerCount < customers.length) {
            customers[customerCount++] = c;
        }
    }

    public Customer findCustomer(String id) {
        if (id == null) return null;
        for (int i = 0; i < customerCount; i++) {
            if (id.equals(customers[i].getId())) return customers[i];
        }
        return null;
    }

    public Reservation findReservation(String id) {
        if (id == null) return null;
        for (int i = 0; i < reservationCount; i++) {
            if (id.equals(reservations[i].getId())) return reservations[i];
        }
        return null;
    }

    /**
     * Attempt to make a reservation. Returns the created reservation or null if fail.
     * Also prints confirmation lines (price, id) to System.out as per exercise.
     */
    public Reservation makeReservation(String customerId, Screening screening) {
        Customer cust = findCustomer(customerId);
        if (cust == null) {
            System.out.println("Invalid customer number");
            return null;
        }
        if (screening == null) {
            System.out.println("Invalid screening");
            return null;
        }
        if (!screening.hasSeatsAvailable()) {
            System.out.println("Screening is fully booked");
            return null;
        }

        String rid = "R" + counter++;
        Reservation res = new Reservation(rid, cust, screening, false);
        if (screening.addReservation(res)) {
            if (reservationCount < reservations.length) {
                reservations[reservationCount++] = res;
            }
            double price = screening.getTicketPrice();
            if (cust.hasDiscount()) {
                price *= 0.95;
            }
            System.out.println("Reservation confirmed. ID=" + rid + ", price=" + price);
            return res;
        } else {
            System.out.println("Failed to add reservation to screening");
            return null;
        }
    }

    /**
     * Validate a reservation number at payment time.
     * If valid and unused, mark as used and return true.
     */
    public boolean validateReservation(String reservationId) {
        Reservation r = findReservation(reservationId);
        if (r == null) {
            System.out.println("Reservation not found");
            return false;
        }
        if (r.isUsed()) {
            System.out.println("Reservation already used");
            return false;
        }
        r.setUsed(true);
        r.getCustomer().incrementPastScreenings();
        System.out.println("Reservation " + reservationId + " marked as used");
        return true;
    }
}