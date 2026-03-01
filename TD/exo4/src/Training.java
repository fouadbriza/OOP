public class Training {
    private String code;
    private String title;
    private Student[] enrolledStudents = new Student[30];
    private Workshop[] workshops = new Workshop[10];
    private int studentCount = 0;
    private int workshopCount = 0;

    public Training(String code) {
        this.code = code;
    }

    public Training(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public void addStudent(Student s) {
        if (studentCount < enrolledStudents.length && s != null) {
            enrolledStudents[studentCount++] = s;
        }
    }

    public void addWorkshop(Workshop w) {
        if (workshopCount < workshops.length && w != null) {
            workshops[workshopCount++] = w;
        }
    }


    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public Student[] getStudents() {
        return enrolledStudents;
    }

    public int getWorkshopCount() {
        return workshopCount;
    }

    public Workshop[] getWorkshops() {
        return workshops;
    }

    /**
     * Returns true if the specified workshop belongs to this training.
     * Used when filtering absence reports.
     */
    public boolean hasWorkshop(Workshop w) {
        if (w == null) return false;
        for (int i = 0; i < workshopCount; i++) {
            if (workshops[i] == w) {
                return true;
            }
        }
        return false;
    }}