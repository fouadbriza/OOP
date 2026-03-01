public class Reservation {
    private String id;
    private Customer customer;
    private Screening screening;
    private boolean used;

    public Reservation(String id, Customer customer, Screening screening, boolean used) {
        this.id = id;
        this.customer = customer;
        this.screening = screening;
        this.used = used;
    }
}