public class AttendanceReporter {
    public String formatEnrolledStudents(AttendanceService service) {
        StringBuilder sb = new StringBuilder();
        sb.append("=== ENROLLED STUDENTS & TOTAL ABSENCES ===\n");
        for (int t = 0; t < service.getTrainingCount(); t++) {
            Training tr = service.getTrainings()[t];
            sb.append("Training: ").append(tr.getTitle()).append("\n");
            for (int i = 0; i < tr.getStudentCount(); i++) {
                Student s = tr.getStudents()[i];
                sb.append("- ")
                  .append(s.getFirstname()).append(" ")
                  .append(s.getLastname())
                  .append(" | ID: ").append(s.getId())
                  .append(" | Absences: ").append(s.getAbsence())
                  .append("\n");
            }
        }
        return sb.toString();
    }

    public String formatWorkshops(Training training) {
        StringBuilder sb = new StringBuilder();
        sb.append("Workshops for: ").append(training.getTitle()).append("\n");
        for (int i = 0; i < training.getWorkshopCount(); i++) {
            Workshop w = training.getWorkshops()[i];
            sb.append("[ ")
              .append(w.isConducted() ? "Conducted" : "planned")
              .append(" ] ")
              .append(w.getDate()).append(" at ").append(w.getTime())
              .append("\n");
        }
        return sb.toString();
    }

    public String formatWorkshops(Training training, String filter) {
        if (filter != null && filter.equalsIgnoreCase("conducted")) {
            StringBuilder sb = new StringBuilder();
            sb.append("Conducted Workshops for: ").append(training.getTitle()).append("\n");
            for (int i = 0; i < training.getWorkshopCount(); i++) {
                Workshop w = training.getWorkshops()[i];
                if (w.isConducted()) {
                    sb.append("[ Conducted ] ")
                      .append(w.getDate()).append(" at ").append(w.getTime())
                      .append("\n");
                }
            }
            return sb.toString();
        } else {
            return formatWorkshops(training);
        }
    }

    public String formatAbsentees(Workshop w) {
        StringBuilder sb = new StringBuilder();
        sb.append("Absentees for Workshop on ").append(w.getDate()).append(":\n");
        for (int i = 0; i < w.getAbsenceCount(); i++) {
            Student s = w.getAbsentees()[i];
            sb.append("- ")
              .append(s.getFirstname()).append(" ").append(s.getLastname())
              .append(" (ID: ").append(s.getId()).append(")\n");
        }
        return sb.toString();
    }

    public String formatStudentAbsenceDetails(Student s, Training training) {
        StringBuilder sb = new StringBuilder();
        sb.append("Detailed absence history for: ")
          .append(s.getFirstname()).append(" ").append(s.getLastname()).append("\n");
        for (int i = 0; i < s.getAbsence(); i++) {
            Workshop w = s.getAbsentWorkshops()[i];
            if (training == null || training.hasWorkshop(w)) {
                sb.append("* Missed workshop on ")
                  .append(w.getDate()).append(" at ").append(w.getTime()).append("\n");
            }
        }
        return sb.toString();
    }
}