public class Customer {
    private String id;
    private int pastScreeningsCount;
    // could store reservations if desired

    public Customer(String id, int pastScreeningsCount) {
        this.id = id;
        this.pastScreeningsCount = pastScreeningsCount;
    }
}