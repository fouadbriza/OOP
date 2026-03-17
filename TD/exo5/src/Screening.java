public class Screening {
    private static int counter = 0;

    private int id;
    private String date;
    private String startTime;
    private String endTime;
    private double ticketPrice;
    private Movie movie;
    private Reservation[] reservations;
    private int capacity;

    public Screening(String date, String startTime, String endTime,
                     double ticketPrice, Movie movie, Reservation[] reservations,
                     int capacity) {
        this.id = counter++;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.ticketPrice = ticketPrice;
        this.movie = movie;
        this.reservations = reservations;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public Movie getMovie() {
        return movie;
    }

    public Reservation[] getReservations() {
        return reservations;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getReservationCount() {
        int count = 0;
        if (reservations != null) {
            for (Reservation r : reservations) {
                if (r != null) count++;
            }
        }
        return count;
    }

    public boolean hasSeatsAvailable() {
        return getReservationCount() < capacity;
    }

    public boolean addReservation(Reservation r) {
        if (r == null || !hasSeatsAvailable()) return false;
        for (int i = 0; i < reservations.length; i++) {
            if (reservations[i] == null) {
                reservations[i] = r;
                return true;
            }
        }
        return false;
    }
}