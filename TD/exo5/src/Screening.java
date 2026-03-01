public class Screening {
    private static int counter = 0; // auto‑increment id generator

    private int id;
    private String date;      // could use String or LocalDate
    private String startTime; // String or LocalTime
    private String endTime;
    private double ticketPrice;
    private Movie movie;
    private Reservation[] reservations;

    public Screening(String date, String startTime, String endTime,
                     double ticketPrice, Movie movie, Reservation[] reservations) {
        this.id = counter++;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.ticketPrice = ticketPrice;
        this.movie = movie;
        this.reservations = reservations;
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
}