public class Workshop {
    private String date;
    private String time;
    private String status;
    private Student[] absentees = new Student[30];
    private int absenceCount = 0;

    public Workshop(String date, String time) {
        this.date = date;
        this.time = time;
        this.status = "planed";
    }

    public void addAbsentees(Student[] s) {
        if (s == null) return;
        for (Student st : s) {
            if (st == null) continue;
            if (absenceCount < absentees.length) {
                absentees[absenceCount++] = st;
            }
        }
    }


    public boolean isConducted() {
        return absenceCount > 0;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public int getAbsenceCount() {
        return absenceCount;
    }

    public Student[] getAbsentees() {
        return absentees;
    }
}