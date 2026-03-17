public class Customer {
    private String id;
    private int pastScreeningsCount;

    public Customer(String id, int pastScreeningsCount) {
        this.id = id;
        this.pastScreeningsCount = pastScreeningsCount;
    }

    public String getId() {
        return id;
    }

    public int getPastScreeningsCount() {
        return pastScreeningsCount;
    }

    public void incrementPastScreenings() {
        pastScreeningsCount++;
    }

    public boolean hasDiscount() {
        return pastScreeningsCount > 25;
    }
}