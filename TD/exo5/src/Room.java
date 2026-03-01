public class Room {
    private static int counter = 0;    // generates new id values

    private int id;
    private int capacity;
    private Screening[] screenings;

    public Room(int capacity, Screening[] screenings) {
        this.id = counter++;
        this.capacity = capacity;
        this.screenings = screenings;
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public Screening[] getScreenings() {
        return screenings;
    }
}