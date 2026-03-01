public class App {
    public static void main(String[] args) throws Exception {
        Room[] rooms = new Room[3];
        rooms[0] = new Room(100, new Screening[0]);
        rooms[1] = new Room(80, new Screening[0]);
        rooms[2] = new Room(120, new Screening[0]);

        Cinema c1 = new Cinema("Atlas", "Bab el Oued", rooms);
        System.out.println("Cinema " + c1.getName() + " created with " + rooms.length + " rooms.");



    }
}
