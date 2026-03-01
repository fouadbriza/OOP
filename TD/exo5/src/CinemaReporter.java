public class CinemaReporter {
    public String browseScreenings(Cinema c) {
        if (c == null) return "";

        StringBuilder sb = new StringBuilder();
        sb.append("Scheduled screenings for cinema ")
          .append(c.getName()).append("\n");

        Room[] rooms = c.getRooms();
        if (rooms == null) return sb.toString();

        for (int ri = 0; ri < rooms.length; ri++) {
            Room r = rooms[ri];
            if (r == null) continue;
            sb.append("Room ").append(r.getId())
              .append(" (capacity ").append(r.getCapacity()).append(")\n");
            Screening[] scrs = r.getScreenings();
            if (scrs == null) continue;
            for (int si = 0; si < scrs.length; si++) {
                Screening s = scrs[si];
                if (s == null) continue;
                sb.append("  Screening ").append(s.getId())
                  .append(": ").append(s.getDate()).append(" ")
                  .append(s.getStartTime()).append(" - ")
                  .append(s.getEndTime()).append(" (price ")
                  .append(s.getTicketPrice()).append(")\n");

                Movie m = s.getMovie();
                if (m != null) {
                    sb.append("    Movie: ").append(m.getTitle())
                      .append(" (").append(m.getProductionYear()).append(")\n");
                    sb.append("      Director: ").append(m.getDirector()).append("\n");
                    sb.append("      Actors: ");
                    String[] actors = m.getActors();
                    if (actors != null) {
                        for (int ai = 0; ai < actors.length; ai++) {
                            sb.append(actors[ai]);
                            if (ai < actors.length - 1) sb.append(", ");
                        }
                    }
                    sb.append("\n");
                    sb.append("      Synopsis: ").append(m.getSynopsis()).append("\n");
                }
            }
        }
        return sb.toString();
    }
}
