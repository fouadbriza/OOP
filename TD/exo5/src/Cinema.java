public class Cinema {
    private String name;
    private String address;
    private Room[] rooms;

    public Cinema(String name, String address, Room[] rooms) {
        this.name = name;
        this.address = address;
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }

    public Room[] getRooms() {
        return rooms;
    }
}