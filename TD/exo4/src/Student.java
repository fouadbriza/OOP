public class Student {
    private String firstname;
    private String lastname;
    private String id;
    private int absenceCounter;
    private Workshop[] absentFromWorkshop=new Workshop[30];

    public Student(String firstname, String lastname, String id) {
        this.firstname = firstname;
        this.lastname  = lastname;
        this.id        = id;
    }

    public void incrementAbsence() {
        absenceCounter++;
    }

    public void addAbsenceFromWorkshop(Workshop w) {
        absentFromWorkshop[absenceCounter]=w;
        absenceCounter++;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getId() {
        return id;
    }

    public int getAbsence() {
        return absenceCounter;
    }

    public Workshop[] getAbsentWorkshops() {
        return absentFromWorkshop;
    }
}