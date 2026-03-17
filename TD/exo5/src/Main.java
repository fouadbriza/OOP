public class Main {
    public static void main(String[] args) throws Exception {
        Movie m1 = new Movie("The Matrix", 1999, "Wachowski",
                             new String[]{"Keanu Reeves","Laurence Fishburne"},
                             "A computer hacker learns about the true nature of reality.");
        Movie m2 = new Movie("Inception", 2010, "Nolan",
                             new String[]{"Leonardo DiCaprio","Joseph Gordon-Levitt"},
                             "A thief enters people's dreams to steal secrets.");
        Movie m3 = new Movie("Interstellar", 2014, "Nolan",
                             new String[]{"Matthew McConaughey","Anne Hathaway"},
                             "Explorers travel through a wormhole in space.");

        Screening s1 = new Screening("2025-02-16", "14:00", "16:00", 10.0, m1,
                                     new Reservation[100], 100);
        Screening s2 = new Screening("2025-02-16", "20:00", "22:00", 12.0, m2,
                                     new Reservation[100], 100);
        Screening s3 = new Screening("2025-02-16", "14:30", "16:30", 11.0, m2,
                                     new Reservation[80], 80);
        Screening s4 = new Screening("2025-02-16", "21:00", "23:00", 13.0, m3,
                                     new Reservation[80], 80);
        Screening s5 = new Screening("2025-02-16", "15:00", "17:00", 9.0, m3,
                                     new Reservation[120], 120);
        Screening s6 = new Screening("2025-02-16", "19:00", "21:00", 10.0, m1,
                                     new Reservation[120], 120);

        Room[] rooms = new Room[3];
        rooms[0] = new Room(100, new Screening[]{s1, s2});
        rooms[1] = new Room(80, new Screening[]{s3, s4});
        rooms[2] = new Room(120, new Screening[]{s5, s6});

        Cinema c1 = new Cinema("Atlas", "Bab el Oued", rooms);
        System.out.println("Cinema " + c1.getName() + " created with " + rooms.length + " rooms.");

        CinemaReporter reporter = new CinemaReporter();
        System.out.println(reporter.browseScreenings(c1));

        ReservationService rs = new ReservationService();
        Customer cust1 = new Customer("C001", 10);
        Customer cust2 = new Customer("C002", 30);
        rs.addCustomer(cust1);
        rs.addCustomer(cust2);

        System.out.println("--- Reservation tests ---");
        rs.makeReservation("C001", s1);
        rs.makeReservation("C002", s1);
        for (int i = 0; i < 100; i++) {
            rs.makeReservation("C001", s1);
        }
        rs.makeReservation("C001", s1);
        rs.makeReservation("C999", s2);

        Reservation r = rs.makeReservation("C001", s2);
        if (r != null) {
            rs.validateReservation(r.getId());
            rs.validateReservation(r.getId());
        }
        rs.validateReservation("nope");



    }
}
